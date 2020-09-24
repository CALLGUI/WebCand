package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.dto.ExperienceProDto;
import fr.ipst.webcand.v2.webcand.dto.mapper.IExperienceProMapper;
import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IExperienceProService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencespro")
@Tag(name = "Gestion des expériences pro")
public class ExperienceProController {

    @Autowired
    private IExperienceProService exservice;

    @Autowired
    private IExperienceProMapper exmapper;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer toutes les expériences pro")
    public ResponseEntity<List<ExperienceProDto>> getAll() {
        return ResponseEntity.ok(exmapper.listeEntiteVersListeDto(exservice.getAll()));
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer une expérience pro")
    public ResponseEntity<ExperienceProDto> createExpPro(@RequestBody final ExperienceProDto expPro) {

        final ExperienceProEntity saved = exservice.save(exmapper.dtoVersEntite(expPro));
        return new ResponseEntity<>(exmapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer une expérience pro")
    public ResponseEntity<ExperienceProDto> getExpProById(@PathVariable("id")final Long expProId) {

        final ExperienceProEntity eEntity = this.exservice.findById(expProId);
        return new ResponseEntity<>(exmapper.entiteVersDto(eEntity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour une expérience pro")
    public ResponseEntity<ExperienceProDto> updateExpPro(@RequestBody final ExperienceProDto experienceProDto) {

        final ExperienceProEntity saved = this.exservice.update(exmapper.dtoVersEntite(experienceProDto));
        return new ResponseEntity<>(exmapper.entiteVersDto(saved), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer une expérience pro")
    public void deleteExpPro(@PathVariable("id")final Long expProId) {
        this.exservice.deleteById(expProId);
    }

}
