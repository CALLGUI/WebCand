package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.IExperienceProRepository;
import fr.ipst.webcand.v2.webcand.repository.IProfilRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IExperienceProEtProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ExperienceProEtProfilService implements IExperienceProEtProfilService {

    @Autowired
    private IProfilRepository profilRepository;

    @Autowired
    private IExperienceProRepository experienceProRepository;

    public List<Map<String, Object>> afficherListeExpProDuProfil(Long id) {
        return profilRepository.afficherListeExpProDuProfil(id);
    }

    public ExperienceProEntity addExpPro(Long idProfil, ExperienceProEntity expPro) {
        ProfilEntity profil = profilRepository.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil","id","idProfil"));

        if (profil == null) {
            return null;
        }

        profil.getExpPro().add(expPro);

        return expPro;
    }

    public void removeExpPro(Long idProfil, Long idExpPro) {
        ProfilEntity profil = profilRepository.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil","id","idProfil"));

        if (profil == null) {
            return ;
        }
        ExperienceProEntity expPro = experienceProRepository.findById(idExpPro).
                orElseThrow(()->new RessourceNotFoundException("expPro","id","idExpPro"));
        profil.getDiplomes().remove(expPro);
    }

}
