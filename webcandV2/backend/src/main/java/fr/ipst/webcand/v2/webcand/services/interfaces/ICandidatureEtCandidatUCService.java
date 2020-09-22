package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ICandidatureEtCandidatUCService {

    CandidatureEntity findById(Long id);

    CandidatureEntity addCandidature(Long idCandidat, CandidatureEntity candidature);
    void removeCandidature (Long idCandidat, Long idCandidature);

    List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(Long id);
    CandidatureEntity AfficherLaCandidatureDuCandidat(Long idCandidat, Long idCandidature);;

}
