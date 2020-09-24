package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.IDiplomeRepository;
import fr.ipst.webcand.v2.webcand.repository.IProfilRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IDiplomeEtProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class DiplomeEtProfilService implements IDiplomeEtProfilService {

    @Autowired
    private IProfilRepository profilRepository;

    @Autowired
    private IDiplomeRepository diplomeRepository;

    public List<Map<String,Object>> afficherListeDiplomeDuProfil(Long id) {
        return profilRepository.afficherListeDiplomeDuProfil(id);
    }

    public DiplomeEntity addDiplome(Long idProfil, DiplomeEntity diplome) {
        ProfilEntity profil = profilRepository.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil","id","idProfil"));

        if (profil == null) {
            return null;
        }

        profil.getDiplomes().add(diplome);

        return diplome;
    }

    public void removeDiplome(Long idProfil, Long idDiplome) {
        ProfilEntity profil = profilRepository.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil","id","idProfil"));

        if (profil == null) {
            return ;
        }
        DiplomeEntity diplome = diplomeRepository.findById(idDiplome).
                orElseThrow(()->new RessourceNotFoundException("diplôme","id","idDiplome"));
        profil.getDiplomes().remove(diplome);
    }

}
