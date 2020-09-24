package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import fr.ipst.webcand.v2.webcand.repository.IFichierRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IFichierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FichierService implements IFichierService {

    @Autowired
    private IFichierRepository docRepository;

    public FichierEntity store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FichierEntity FileDB = new FichierEntity(fileName, file.getContentType(), file.getBytes());

        return docRepository.save(FileDB);
    }

    public FichierEntity getFile(Long id) {
        return docRepository.findById(id).get();
    }

    public Stream<FichierEntity> getAllFiles() {
        return docRepository.findAll().stream();
    }
}