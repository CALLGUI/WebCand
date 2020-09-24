package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.DiplomeDto;
import fr.ipst.webcand.v2.webcand.dto.mapper.IDiplomeMapper;
import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IDiplomeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diplomes")
@Tag(name = "Gestion des Diplômes")
public class DiplomeController {

    @Autowired
    private IDiplomeService dservice;

    @Autowired
    private IDiplomeMapper dmapper;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les diplômes")
    public ResponseEntity<List<DiplomeDto>> getAll() {
        return ResponseEntity.ok(dmapper.listeEntiteVersListeDto(dservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un diplôme")
    public ResponseEntity<DiplomeDto> createDiplome(@RequestBody final DiplomeDto diplomeDto) {

        final DiplomeEntity saved = dservice.save(dmapper.dtoVersEntite(diplomeDto));
        return new ResponseEntity<>(dmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un diplôme")
    public ResponseEntity<DiplomeDto> getDiplomeById(@PathVariable("id") final Long diplomeId) {

        final DiplomeEntity dEntity = this.dservice.findById(diplomeId);
        return new ResponseEntity<>(dmapper.entiteVersDto(dEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un diplôme")
    public ResponseEntity<DiplomeDto> updateDiplome(@RequestBody final DiplomeDto diplomeDto) {

        final DiplomeEntity saved = this.dservice.update(dmapper.dtoVersEntite(diplomeDto));
        return new ResponseEntity<>(dmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un diplôme")
    public void deleteDiplome(@PathVariable("id") final Long diplomeId) {

        this.dservice.deleteById(diplomeId);
    }

}
