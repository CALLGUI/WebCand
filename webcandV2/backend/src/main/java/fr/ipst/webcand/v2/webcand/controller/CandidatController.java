package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.CandidatDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.ICandidatMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/candidats")
@Tag(name = "Gestion des candidats")
public class CandidatController {

    @Autowired
    private ICandidatService cservice;

    @Autowired
    private ICandidatMapper cmapper;


    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les candidats.")
    public ResponseEntity<List<CandidatDto>> getAll() {

        return ResponseEntity.ok(cmapper.listeEntiteVersListeDto(cservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un candidat.")
    public ResponseEntity<CandidatDto> createCandidat(@RequestBody final CandidatDto candidatDto) {

        final CandidatEntity saved = cservice.save(cmapper.dtoVersEntite(candidatDto));
        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un candidat.")
    public ResponseEntity<CandidatDto> getCandidatById(@PathVariable("id") final Long candidatId) {

        final CandidatEntity cEntity = this.cservice.findById(candidatId);
        return new ResponseEntity<>(cmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un candidat.")
    public ResponseEntity<CandidatDto> updateCandidat(@RequestBody final CandidatDto candidatDto) {

        final CandidatEntity saved = this.cservice.update(cmapper.dtoVersEntite(candidatDto));
        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un candidat.")
    public void deleteCandidat(@PathVariable("id") final Long candidatId) {

        this.cservice.deleteById(candidatId);
    }

    @GetMapping("/{id}/candidatures")
    @Operation(summary = "Méthode permettant d'afficher les candidatures du candidat.")
    public ResponseEntity<List<Map<String,Object>>> AfficherLesSessionsDeLaFormation(@PathVariable("id") long id){

        return ResponseEntity.ok(cservice.AfficherLesCandidaturesDuCandidat(id));
    }

    /*
    Forme d'un POST JSON http://localhost:8080/api/candidats
    {
        "idCandidat": 50,
            "nomCandidat": "tatat",
            "prenomCandidat": "tatatata",
            "dateNaissanceCandidat": "00/00/1900",
            "adresseCandidat": "10 0rue",
            "codePostalCandidat": "31100000",
            "villeCandidat": "Toulouseeeee",
            "paysCandidat": "franceeeee",
            "telephoneCandidat": "0600000000",
            "ccandidatures":[
                {
                    "idCandidature": 5
                }
            ]
    }
    */
}
