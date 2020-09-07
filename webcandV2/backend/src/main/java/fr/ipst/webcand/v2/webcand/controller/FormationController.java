package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.FormationDto;
import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import fr.ipst.webcand.v2.webcand.mapper.IFormationMapper;
import fr.ipst.webcand.v2.webcand.services.FormationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formations")
@Tag(name = "Gestion des formations")
public class FormationController {

    @Autowired
    private FormationService cservice;

    @Autowired
    private IFormationMapper cmapper;


    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les formations.")
    public ResponseEntity<List<FormationDto>> getAll() {

        return ResponseEntity.ok(cmapper.listeEntiteVersListeDto(cservice.getAll()));
    }


    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un formation.")
    public ResponseEntity<FormationDto> createCandidat(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = cservice.save(cmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un formation.")
    public ResponseEntity<FormationDto> getCandidatById(@PathVariable("id") final Long formationId) {

        final FormationEntity cEntity = this.cservice.findById(formationId);
        //.orElseThrow(() -> new RessourceNotFoundException("candidat", "id", formationId));
        return new ResponseEntity<>(cmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un formation.")
    public ResponseEntity<FormationDto> updateCandidat(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = this.cservice.update(cmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id]")
    @Operation(summary = "Méthode permettant de supprimer un formation.")
    public void deleteCandidat(@PathVariable("id") final Long formationId) {
        //public ResponseEntity<?> deleteCandidat(@PathVariable("id") final Long formationId) {
        this.cservice.deleteById(formationId);
        //return ResponseEntity.ok().build();
    }
}
