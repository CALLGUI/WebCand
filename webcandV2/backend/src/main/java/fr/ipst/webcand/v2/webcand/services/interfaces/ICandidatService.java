package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ICandidatService {
    List<CandidatEntity> getAll();
    CandidatEntity findById(Long id);
    CandidatEntity save(CandidatEntity CandidatEntity);
    CandidatEntity update(CandidatEntity CandidatEntity);
    void deleteById(Long id);
    List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(Long id);
}
