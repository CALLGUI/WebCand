package fr.ipst.webcand.v2.webcand.controller;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import fr.ipst.webcand.v2.webcand.services.interfaces.IFichierService;
import fr.ipst.webcand.v2.webcand.util.ReponseFichier;
import fr.ipst.webcand.v2.webcand.util.ReponseMessage;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@Tag(name = "Gestion des fichiers")
public class FichierController {
    
    @Autowired
    private IFichierService fichierService;

    @PostMapping("/upload")
    public ResponseEntity<ReponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            fichierService.store(file);

            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ReponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ReponseMessage(message));
        }
    }

    @GetMapping("/files")
    public ResponseEntity<List<ReponseFichier>> getListFiles() {
        List<ReponseFichier> files = fichierService.getAllFiles().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(String.valueOf(dbFile.getIdDocument()))
                    .toUriString();

            return new ReponseFichier(
                    dbFile.getNomFichier(),
                    fileDownloadUri,
                    dbFile.getType(),
                    dbFile.getData().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        FichierEntity fileDB = fichierService.getFile(id);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""
                        + fileDB.getNomFichier() + "\"")
                .body(fileDB.getData());
    }
}