package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.SessionFormationDto;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.mapper.ISessionFormationMapper;
import fr.ipst.webcand.v2.webcand.services.SessionFormationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessionsformation")
@Tag(name = "Gestion des sessions de formation")
public class SessionFormationController {

    @Autowired
    private SessionFormationService sfservice;

    @Autowired
    private ISessionFormationMapper sfmapper;

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
    @Operation(summary = "Méthode permettant de supprimer une session de formation")
    public void deleteSessionFormation(@PathVariable("id") final Long sessionFormationId) {
        this.sfservice.deleteById(sessionFormationId);
    }

    @GetMapping("/datedebut/{datedebut}")
    @Operation(summary = "Méthode permettant de trouver les sessions de formation grace a une date debut")
    public ResponseEntity<List<SessionFormationDto>> findByDateDebutSession(@PathVariable("datedebut")final String dateDebut){
        return ResponseEntity.ok(sfmapper.listeEntiteVersListeDto(sfservice.findByDateDebutSession(dateDebut)));
    }

    @GetMapping("/datefin/{datefin}")
    @Operation(summary = "Méthode permettant de trouver les sessions de formation grace a une date fin")
    public ResponseEntity<List<SessionFormationDto>> findByDateFinSession(@PathVariable("datefin")final String dateFin){
        return ResponseEntity.ok(sfmapper.listeEntiteVersListeDto(sfservice.findByDateFinSession(dateFin)));
    }

    /*
    Forme d'un POST JSON http://localhost:8080/api/sessionsformation
    {
        "dateDebutSession": "2019",
        "dateFinSession": "2020",
        "formationEntity": {
        },
        "sessionCandidatures": [
            {
                "idCandidature": 12
            }
        ]
    }*/

}
