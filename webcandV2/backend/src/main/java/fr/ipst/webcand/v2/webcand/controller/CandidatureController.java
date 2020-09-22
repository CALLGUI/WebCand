package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.CandidatureDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.ICandidatureMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidatures")
@Tag(name = "Gestion des Candidatures")
public class CandidatureController {


    @Autowired
    private ICandidatureService cuservice;

    @Autowired
    private ICandidatureMapper cumapper;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer toutes les candidatures")
    public ResponseEntity<List<CandidatureDto>> getAll() {

        return ResponseEntity.ok(cumapper.listeEntiteVersListeDto(cuservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer une candidature")
    public ResponseEntity<CandidatureDto> createCandidature(@RequestBody final CandidatureDto candidatureDto) {

        final CandidatureEntity saved = cuservice.save(cumapper.dtoVersEntite(candidatureDto));
        return new ResponseEntity<>(cumapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer une candidature")
    public ResponseEntity<CandidatureDto> getCandidatureById(@PathVariable("id") final Long candidatureId) {

        final CandidatureEntity cuEntity = this.cuservice.findById(candidatureId);
        return new ResponseEntity<>(cumapper.entiteVersDto(cuEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour une candidature")
    public ResponseEntity<CandidatureDto> updateCandidature(@RequestBody final CandidatureDto candidatureDto) {

        final CandidatureEntity saved = this.cuservice.update(cumapper.dtoVersEntite(candidatureDto));
        return new ResponseEntity<>(cumapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer une candidature")
    public void deleteCandidature(@PathVariable("id") final Long candidatureId) {

        this.cuservice.deleteById(candidatureId);
    }
}
