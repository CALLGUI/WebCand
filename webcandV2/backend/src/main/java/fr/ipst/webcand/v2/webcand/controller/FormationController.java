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
import java.util.Map;

@RestController
@RequestMapping("/api/formations")
@Tag(name = "Gestion des formations")
public class FormationController {

    @Autowired
    private FormationService fservice;

    @Autowired
    private IFormationMapper fmapper;


    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les formations.")
    public ResponseEntity<List<FormationDto>> getAll() {

        return ResponseEntity.ok(fmapper.listeEntiteVersListeDto(fservice.getAll()));
    }


    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un formation.")
    public ResponseEntity<FormationDto> createCandidat(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = fservice.save(fmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(fmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un formation.")
    public ResponseEntity<FormationDto> getCandidatById(@PathVariable("id") final Long formationId) {

        final FormationEntity cEntity = this.fservice.findById(formationId);
        //.orElseThrow(() -> new RessourceNotFoundException("candidat", "id", formationId));
        return new ResponseEntity<>(fmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un formation.")
    public ResponseEntity<FormationDto> updateCandidat(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = this.fservice.update(fmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(fmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un formation.")
    public void deleteCandidat(@PathVariable("id") final Long formationId) {
        //public ResponseEntity<?> deleteCandidat(@PathVariable("id") final Long formationId) {
        this.fservice.deleteById(formationId);
        //return ResponseEntity.ok().build();
    }

    @GetMapping("/noms")
    public ResponseEntity<List<Map<String,Object>>> testa(){
        return ResponseEntity.ok(fservice.testa());
    }
}
