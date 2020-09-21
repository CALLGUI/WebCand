package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface ICandidatureEtCandidatUCService {

    CandidatureEntity addCandidature(Long idCandidat, CandidatureEntity candidature);
    void removeCandidature (Long idCandidat, Long idCandidature);

    Set<CandidatureEntity> getAllCandidaturesByIdCandidat(Long idCandidat);
    CandidatureEntity getCandidatureByIdCandidat(Long idCandidat, Long idCandidature);
}
