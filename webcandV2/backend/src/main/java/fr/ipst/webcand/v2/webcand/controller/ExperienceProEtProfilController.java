package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.ExperienceProDto;
import fr.ipst.webcand.v2.webcand.dto.mapper.IExperienceProMapper;
import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IExperienceProEtProfilService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/profils")
@Tag(name = "Gestion des expériences pro du profil")
public class ExperienceProEtProfilController {

    @Autowired
    private IExperienceProEtProfilService expservice;

    @Autowired
    private IExperienceProMapper expmapper;

    @GetMapping("/{id}/experiencespro")
    @Operation(summary = "Méthode permettant d'afficher les expériences pro d'un profil")
    public ResponseEntity<List<Map<String,Object>>>  afficherListeExpProDuProfil(@PathVariable("id")final Long id) {

        return ResponseEntity.ok(expservice.afficherListeExpProDuProfil(id));
    }

    @PostMapping("/{id}/experiencespro")
    @Operation(summary = "Méthode permettant de créer une expérience pro du profil")
    public ResponseEntity<Void> createExpPro(@PathVariable("id")final Long id,
                                             @RequestBody final ExperienceProDto experienceProDto) {
        ExperienceProEntity expPro = expservice.addExpPro(id, expmapper.dtoVersEntite(experienceProDto));

        if (expPro == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{idExpPro}").buildAndExpand(expPro.getIdExpPro()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}/experiencespro/{idExpPro}")
    @Operation(summary = "Méthode permettant de supprimer une expérience pro du profil")
    public void suppressionExpPro(@PathVariable("id") Long id,
                                  @PathVariable("idExpPro")final Long idExpPro) {

        expservice.removeExpPro(id, idExpPro);
    }

}
