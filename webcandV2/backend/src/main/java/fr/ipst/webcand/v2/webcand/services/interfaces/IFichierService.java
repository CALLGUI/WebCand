package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Service
public interface IFichierService {
    FichierEntity store(MultipartFile file) throws IOException;
    FichierEntity getFile(Long id);
    Stream<FichierEntity> getAllFiles();
    void deleteById(Long idDocument);
    List<Map<String,Object>> AfficherLesFichiersDuUser(Long idUser);
}
