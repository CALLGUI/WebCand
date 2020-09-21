package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.SessionFormationDto;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.ISessionFormationMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.ISessionFormationEtFormationUCService;
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
@RequestMapping("/api/formations")
@Tag(name = "Gestion des sessions de formation")
public class SessionFormationEtFormationUCController {

    @Autowired
    private ISessionFormationEtFormationUCService fservice;

    @Autowired
    private ISessionFormationMapper imapper;


    @GetMapping("/{id}/sessionsformation")
    @Operation(summary = "Méthode permettant d'afficher les sessions de la formation.")
    public ResponseEntity<List<Map<String,Object>>> AfficherLesSessionsDeLaFormation(@PathVariable("id")final Long id){

        return ResponseEntity.ok(fservice.AfficherLesSessionsDeLaFormation(id));
    }

    @PostMapping("/{id}/sessionsformation")
    @Operation(summary = "Méthode permettant de crée une session de la formation.")
    public ResponseEntity<Void> createSessionFormation(
            @PathVariable("id")final Long id,
            @RequestBody final SessionFormationDto sessionDto) {

        SessionFormationEntity session = fservice.addSession(id,imapper.dtoVersEntite(sessionDto));

        if (session == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{idSessionFormation}").buildAndExpand(session.getIdSessionFormation()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}/sessionsformation/{idSession}")
    @Operation(summary = "Méthode permettant de supprimer une sessions d'une formation.")
    public void suppressionSessionFormation(
            @PathVariable("id") Long id,
            @PathVariable("idSession")final Long idSession) {

        fservice.removeSession(id,idSession);
    }

}