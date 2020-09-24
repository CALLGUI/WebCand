package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import fr.ipst.webcand.v2.webcand.repository.IFichierRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IFichierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Transactional
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

    public void deleteById(Long idDocument){
        this.docRepository.deleteById(idDocument);
    }

    public List<Map<String,Object>> AfficherLesFichiersDuUser(Long idUser){
        return docRepository.AfficherLesFichiersDuUser(idUser);
    }
}