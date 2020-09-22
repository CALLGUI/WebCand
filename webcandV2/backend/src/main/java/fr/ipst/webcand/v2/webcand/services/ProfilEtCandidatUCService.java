package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.ICandidatRepository;
import fr.ipst.webcand.v2.webcand.repository.IProfilRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IProfilEtCandidatUCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProfilEtCandidatUCService implements IProfilEtCandidatUCService {

    @Autowired
    private ICandidatRepository candidatRepo;

    @Autowired
    private IProfilRepository profilRepo;

    public List<ProfilEntity> getAllProfilByIdCandidat(Long idCandidat) {
        CandidatEntity candidatEntity = candidatRepo.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));
        if (candidatEntity == null) {
            return null;
        }

        return candidatEntity.getProfils();

    }

    public ProfilEntity getOneProfilByIdCandidat(Long idCandidat, Long idProfil) {

        CandidatEntity candidat = candidatRepo.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));
        if (candidat == null) {
            return null;
        }

        ProfilEntity profil = profilRepo.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil", "id", "idProfil"));
        if (profil == null) {
            return null;
        }

        return profilRepo.getOne(idProfil);

    }

    public ProfilEntity addProfil(Long idCandidat, ProfilEntity profil) {
        CandidatEntity candidat = candidatRepo.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));

        if (candidat == null) {
            return null;
        }

        candidat.getProfils().add(profil);

        return profil;
    }

    public void removeProfil(Long idCandidat, Long idProfil) {
        CandidatEntity candidat = candidatRepo.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));

        if (candidat == null) {
            return ;
        }
        ProfilEntity profil = profilRepo.findById(idProfil).
                orElseThrow(()->new RessourceNotFoundException("profil", "id", "idProfil"));
        candidat.getProfils().remove(profil);
    }

}
