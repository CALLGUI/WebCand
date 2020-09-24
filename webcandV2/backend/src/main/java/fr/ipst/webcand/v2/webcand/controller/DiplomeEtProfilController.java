package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.DiplomeDto;
import fr.ipst.webcand.v2.webcand.dto.mapper.IDiplomeMapper;
import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IDiplomeEtProfilService;
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
@Tag(name = "Gestion des sessions de formation")
public class DiplomeEtProfilController {

    @Autowired
    private IDiplomeEtProfilService dpservice;

    @Autowired
    private IDiplomeMapper dmapper;

    @GetMapping("/{id}/diplomes")
    @Operation(summary = "Méthode permettant d'afficher les diplômes d'un profil")
    public ResponseEntity<List<Map<String,Object>>> afficherListeDiplomeDuProfil(@PathVariable("id")final Long id) {

        return ResponseEntity.ok(dpservice.afficherListeDiplomeDuProfil(id));
    }

    @PostMapping("/{id}/diplomes")
    @Operation(summary = "Méthode permettant de créer un diplôme dans un profil")
    public ResponseEntity<Void> createDiplome(@PathVariable("id")final Long id,
                                              @RequestBody final DiplomeDto diplomeDto) {

        DiplomeEntity diplome = dpservice.addDiplome(id, dmapper.dtoVersEntite(diplomeDto));

        if (diplome == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{idDiplome}").buildAndExpand(diplome.getIdDiplome()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}/diplomes/{idDiplome}")
    @Operation(summary = "Méthode permettant de supprimer un diplôme d'un profil")
    public void suppressionDiplome(@PathVariable("id") Long id,
                                   @PathVariable("idDiplome")final Long idDiplome) {

        dpservice.removeDiplome(id, idDiplome);
    }

}
