package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.ProfilDto;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import fr.ipst.webcand.v2.webcand.dto.mapper.IProfilMapper;
import fr.ipst.webcand.v2.webcand.services.interfaces.IProfilService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profils")
@Tag(name = "Gestion des profils")
public class ProfilController {

    @Autowired
    private IProfilService pservice;

    @Autowired
    private IProfilMapper pmapper;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les profils")
    public ResponseEntity<List<ProfilDto>> getAll() {
        return ResponseEntity.ok(pmapper.listeEntiteVersListeDto(pservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant de créer un profil")
    public ResponseEntity<ProfilDto> createProfil(@RequestBody final ProfilDto profilDto) {
        final ProfilEntity saved = pservice.save(pmapper.dtoVersEntite(profilDto));

        return new ResponseEntity<>(pmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un profil")
    public ResponseEntity<ProfilDto> getProfilById(@PathVariable("id") final Long profilId) {
        final ProfilEntity cEntity = this.pservice.findById(profilId);
        return new ResponseEntity<>(pmapper.entiteVersDto(cEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un profil")
    public ResponseEntity<ProfilDto> updateProfil(@RequestBody final ProfilDto profilDto) {
        final ProfilEntity saved = this.pservice.update(pmapper.dtoVersEntite(profilDto));
        return new ResponseEntity<>(pmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un profil")
    public void deleteProfil(@PathVariable("id") final Long profilId) {
        this.pservice.deleteById(profilId);
    }



}
