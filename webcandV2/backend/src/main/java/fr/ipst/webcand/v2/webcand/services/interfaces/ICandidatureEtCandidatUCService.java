package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.springframework.stereotype.Service;

@Service
public interface ICandidatureEtCandidatUCService {

    CandidatureEntity addCandidature(Long idCandidat, CandidatureEntity candidature);
    void removeCandidature (Long idCandidat, Long idCandidature);
}
