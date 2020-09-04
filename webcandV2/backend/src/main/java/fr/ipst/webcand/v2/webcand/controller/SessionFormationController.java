package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.SessionFormationDto;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.mapper.ISessionFormatinMapper;
import fr.ipst.webcand.v2.webcand.services.SessionFormationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessionformation")
@Tag(name = "Session de formation")
public class SessionFormationController {

    @Autowired
    private SessionFormationService sfservice;

    @Autowired
    private ISessionFormatinMapper sfmapper;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer les sessions de formations")
    public ResponseEntity<List<SessionFormationDto>> getAll() {

        return ResponseEntity.ok(sfmapper.listeEntiteVersListeDto(sfservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer une session de formation")
    public ResponseEntity<SessionFormationDto> createSessionFormation(@RequestBody final SessionFormationDto sessionFormationDto) {
        final SessionFormationEntity saved = sfservice.save(sfmapper.dtoVersEntite(sessionFormationDto));

        return new ResponseEntity<>(sfmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer une session de formation")
    public ResponseEntity<SessionFormationDto> getSessionFormationById(@PathVariable("id") final Long sessionFormationId) {
        final SessionFormationEntity sfEntity = this.sfservice.findById(sessionFormationId);

        return new ResponseEntity<>(sfmapper.entiteVersDto(sfEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour une session de formation")
    public ResponseEntity<SessionFormationDto> updateSessionFormation(@RequestBody final SessionFormationDto sessionFormationDto) {
        final SessionFormationEntity saved = this.sfservice.update(sfmapper.dtoVersEntite(sessionFormationDto));

        return new ResponseEntity<>(sfmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de suppreimer une session de formation")
    public void deleteSessionFormation(@PathVariable("id") final Long sessionFormationId) {
        this.sfservice.deleteById(sessionFormationId);
    }

}
