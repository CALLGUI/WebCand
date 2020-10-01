package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.ActionRechercheDto;
import fr.ipst.webcand.v2.webcand.dto.mapper.IActionRechercheMapper;
import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IActionRechercheEtCandidatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/candidats")
@Tag(name = "Gestion des actions de recherche")
public class ActionRechercheEtCandidatController {

    @Autowired
    private IActionRechercheEtCandidatService arcservice;

    @Autowired
    private IActionRechercheMapper arcmapper;

    @GetMapping("/{id}/actionsrecherche")
    @Operation(summary = "Méthode permettant d'afficher les actions de recherche du candidat")
    public ResponseEntity<List<Map<String, Object>>> afficherLesActionsRecherchesCandidat(@PathVariable("id")final Long id) {

        return ResponseEntity.ok(arcservice.afficherLesActionsRecherchesCandidat(id));
    }

    @GetMapping("/{id}/actionsrecherche/{idActionRecherche}")
    @Operation(summary = "Méthode permettant de récupérer une action de recherche du candidat")
    public ResponseEntity<ActionRechercheDto> afficherUneActionRechercheCandidat(
                                                @PathVariable("id")final Long idCandidat,
                                                @PathVariable("idActionRecherche")final Long idActionRecherche) {
        final ActionRechercheEntity arcEntity = this.arcservice.afficherUneActionRechercheCandidat(idCandidat,
                idActionRecherche);

        return new ResponseEntity<>(arcmapper.entiteVersDto(arcEntity), HttpStatus.OK);
    }

    @PostMapping("/{id}/actionsrecherche")
    @Operation(summary = "Méthode permettant de créer une action de recherche d'un candidat")
    public ResponseEntity<ActionRechercheDto> createActionRecherche(@PathVariable("id")final Long idCandidat,
                                                      @RequestBody final ActionRechercheDto actionRechercheDto) {
        ActionRechercheEntity actionRecherche = arcservice.addActionRecherche(idCandidat,
                arcmapper.dtoVersEntite(actionRechercheDto));
        if (actionRecherche == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{idActionRecherche}").buildAndExpand(actionRecherche.getIdActionRecherche()).toUri();

        ResponseEntity.created(location).build();
        return new ResponseEntity<>(arcmapper.entiteVersDto(actionRecherche), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}/actionsrecherche/{idActionRecherche}")
    @Operation(summary = "Méthode permettant de supprimer une action de recherche")
    public void suppressionActionRecherche(@PathVariable("id") Long id,
                                           @PathVariable("idActionRecherche") Long idActionRecherche) {
        arcservice.removeActionRecherche(id, idActionRecherche);
    }

}
