package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IExperienceProEtProfilService {

    List<Map<String,Object>> afficherListeExpProDuProfil(Long id);
    ExperienceProEntity addExpPro(Long idProfil, ExperienceProEntity expPro);
    void removeExpPro(Long idProfil, Long idExpPro);

}
