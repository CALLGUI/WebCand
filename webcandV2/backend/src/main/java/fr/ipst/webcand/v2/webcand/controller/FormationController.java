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
    public ResponseEntity<FormationDto> createFormation(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = fservice.save(fmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(fmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un formation.")
    public ResponseEntity<FormationDto> getFormationById(@PathVariable("id") final Long formationId) {

        final FormationEntity cEntity = this.fservice.findById(formationId);
        return new ResponseEntity<>(fmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un formation.")
    public ResponseEntity<FormationDto> updateFormation(@RequestBody final FormationDto formationDto) {

        final FormationEntity saved = this.fservice.update(fmapper.dtoVersEntite(formationDto));

        return new ResponseEntity<>(fmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un formation.")
    public void deleteFormation(@PathVariable("id") final Long formationId) {
        //public ResponseEntity<?> deleteCandidat(@PathVariable("id") final Long formationId) {
        this.fservice.deleteById(formationId);
        //return ResponseEntity.ok().build();
    }

    /* Affichage information specifique avec des requetes SQL natives >repo< */
    @GetMapping("/noms")
    @Operation(summary = "Méthode permettant d'afficher les noms de formation.")
    public ResponseEntity<List<Map<String,Object>>> AfficherLeNomDesFormations(){
        return ResponseEntity.ok(fservice.AfficherLeNomDesFormations());
    }

    @GetMapping("/{id}/informations")
    @Operation(summary = "Méthode permettant de recupérer les informations de la formation et ses sessions .")
    public ResponseEntity<List<Map<String,Object>>> AfficherInfoSessionEtFormation(@PathVariable("id") long id){
        return ResponseEntity.ok(fservice.AfficherInfoSessionEtFormation(id));
    }

    @GetMapping("/{id}/sessionsformation")
    @Operation(summary = "Méthode permettant d'afficher les sessions de la formation.")
    public ResponseEntity<List<Map<String,Object>>> AfficherLesSessionsDeLaFormation(@PathVariable("id") long id){
        return ResponseEntity.ok(fservice.AfficherLesSessionsDeLaFormation(id));
    }

    /*
    Forme d'un POST JSON http://localhost:8080/api/formations
    {
        "nomFormation": "Toto0",

        "descriptionFormation": "totototototo0"
    }
    */
}
