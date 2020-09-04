package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.CandidatDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.mapper.ICandidatMapper;
import fr.ipst.webcand.v2.webcand.services.CandidatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/candidats")
@Tag(name = "Gestion des candidats")
public class CandidatController {

    @Autowired
    private CandidatService cservice;

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
                //.orElseThrow(() -> new RessourceNotFoundException("candidat", "id", candidatId));
        return new ResponseEntity<>(cmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un candidat.")
    public ResponseEntity<CandidatDto> updateCandidat(@RequestBody final CandidatDto candidatDto) {

        /**.orElseThrow(() -> new RessourceNotFoundException("candidatEntity", "id",candidatId));
        candidatEntity.setNomCandidat(candidatEntityInfo.getNomCandidat());
        candidatEntity.setPrenomCandidat(candidatEntityInfo.getPrenomCandidat());
        candidatEntity.setDateNaissanceCandidat(candidatEntityInfo.getDateNaissanceCandidat());
        candidatEntity.setAdresseCandidat(candidatEntityInfo.getAdresseCandidat());
        candidatEntity.setCodePostalCandidat(candidatEntityInfo.getCodePostalCandidat());
        candidatEntity.setVilleCandidat(candidatEntityInfo.getVilleCandidat());
        candidatEntity.setPaysCandidat(candidatEntityInfo.getPaysCandidat());
        candidatEntity.setTelephoneCandidat(candidatEntityInfo.getTelephoneCandidat());
        CandidatEntity majEdCandidat = cr.save(candidatEntity);**/

        final CandidatEntity saved = this.cservice.update(cmapper.dtoVersEntite(candidatDto));

        return new ResponseEntity<>(cmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id]")
    @Operation(summary = "Méthode permettant de supprimer un candidat.")
    public void deleteCandidat(@PathVariable("id") final Long candidatId) {
    //public ResponseEntity<?> deleteCandidat(@PathVariable("id") final Long candidatId) {
        this.cservice.deleteById(candidatId);
        //return ResponseEntity.ok().build();
    }

}
