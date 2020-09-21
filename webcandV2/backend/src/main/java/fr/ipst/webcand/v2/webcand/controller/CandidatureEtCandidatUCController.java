package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.CandidatureDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.ICandidatureMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureEtCandidatUCService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/candidats")
@Tag(name = "Gestion des Candidatures")
public class CandidatureEtCandidatUCController {


    @Autowired
    private ICandidatureEtCandidatUCService cureservice;

    @Autowired
    private ICandidatureMapper cumapper;

    @PostMapping("/{id}/candidatures")
    @Operation(summary = "Méthode permettant de crée une candidature")
    public ResponseEntity<Void> createCandidature(
            @PathVariable("id") Long idCandidat, @RequestBody CandidatureDto candidatureDto) {

        CandidatureEntity candidature = cureservice.addCandidature(idCandidat,cumapper.dtoVersEntite(candidatureDto));

        if(candidature == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{idCandidature}").buildAndExpand(candidature.getIdCandidature()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}/candidatures/{idCandidature}")
    @Operation(summary = "Méthode permettant de supprimer une candidature")
    public void suppressionCandidature(
            @PathVariable("id") Long id, @PathVariable("idCandidature") Long idCandidature){

        cureservice.removeCandidature(id,idCandidature);
    }

}