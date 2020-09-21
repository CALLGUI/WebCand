package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.ActionRechercheDto;
import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.IActionRechercheMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.IActionRechercheService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actionsrecherche")
@Tag(name = "Gestion des actions de recherche")
public class ActionRechercheController {

    @Autowired
    private IActionRechercheService arservice;

    @Autowired
    private IActionRechercheMapper armapper;


    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer toutes les actions de recherche")
    public ResponseEntity<List<ActionRechercheDto>> getAll() {

        return ResponseEntity.ok(armapper.listeEntiteVersListeDto(arservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer une action de recherche")
    public ResponseEntity<ActionRechercheDto> createActionRecherche(@RequestBody final ActionRechercheDto actionRechercheDto) {

        final ActionRechercheEntity saved = arservice.save(armapper.dtoVersEntite(actionRechercheDto));
        return new ResponseEntity<>(armapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer une action de recherche")
    public ResponseEntity<ActionRechercheDto> getActionRechercheById(@PathVariable("id") final Long actionRechercheId) {

        final ActionRechercheEntity arEntity = this.arservice.findById(actionRechercheId);
        return new ResponseEntity<>(armapper.entiteVersDto(arEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour une action de recherche")
    public ResponseEntity<ActionRechercheDto> updateActionRecherche(@RequestBody final ActionRechercheDto actionRechercheDto) {

        final ActionRechercheEntity saved = this.arservice.update(armapper.dtoVersEntite(actionRechercheDto));
        return new ResponseEntity<>(armapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id]")
    @Operation(summary = "Méthode permettant de supprimer une action de recherche")
    public void deleteActionRecherche(@PathVariable("id") final Long actionRechercheId) {

        this.arservice.deleteById(actionRechercheId);
    }

}
