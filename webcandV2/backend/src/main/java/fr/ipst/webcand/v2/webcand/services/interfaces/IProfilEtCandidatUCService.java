package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProfilEtCandidatUCService {

    List<ProfilEntity> getAllProfilByIdCandidat(Long idCandidat);
    ProfilEntity getOneProfilByIdCandidat(Long idCandidat, Long idProfil);
    ProfilEntity addProfil(Long idCandidat, ProfilEntity profil);
    void removeProfil(Long idCandidat, Long idProfil);

}
