package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IDiplomeEtProfilService {

    List<Map<String,Object>> afficherListeDiplomeDuProfil(Long id);
    DiplomeEntity addDiplome(Long idProfil, DiplomeEntity diplome);
    void removeDiplome(Long idProfil, Long idDiplome);

}
