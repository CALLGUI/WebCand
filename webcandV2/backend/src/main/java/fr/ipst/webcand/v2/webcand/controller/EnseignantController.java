package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.EnseignantDto;
import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import fr.ipst.webcand.v2.webcand.mapper.IEnseignantMapper;
import fr.ipst.webcand.v2.webcand.services.EnseignantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enseignants")
@Tag(name = "Gestion des enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantService cservice;

    @Autowired
    private IEnseignantMapper cmapper;


    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les enseignants.")
    public ResponseEntity<List<EnseignantDto>> getAll() {

        return ResponseEntity.ok(cmapper.listeEntiteVersListeDto(cservice.getAll()));
    }


    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un enseignant.")
    public ResponseEntity<EnseignantDto> createEnseignant(@RequestBody final EnseignantDto enseignantDto) {

        final EnseignantEntity saved = cservice.save(cmapper.dtoVersEntite(enseignantDto));

        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un enseignant.")
    public ResponseEntity<EnseignantDto> getEnseignantById(@PathVariable("id") final Long formationId) {

        final EnseignantEntity cEntity = this.cservice.findById(formationId);
        //.orElseThrow(() -> new RessourceNotFoundException("candidat", "id", formationId));
        return new ResponseEntity<>(cmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un enseignant.")
    public ResponseEntity<EnseignantDto> updateEnseignant(@RequestBody final EnseignantDto enseignantDto) {

        final EnseignantEntity saved = this.cservice.update(cmapper.dtoVersEntite(enseignantDto));

        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id]")
    @Operation(summary = "Méthode permettant de supprimer un enseignant.")
    public void deleteEnseignant(@PathVariable("id") final Long enseignantID) {
        //public ResponseEntity<?> deleteCandidat(@PathVariable("id") final Long formationId) {
        this.cservice.deleteById(enseignantID);
        //return ResponseEntity.ok().build();
    }
}
