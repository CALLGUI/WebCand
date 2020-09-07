package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICandidatureService {
    List<CandidatureEntity> getAll();
    CandidatureEntity findById(Long id);
    CandidatureEntity save(CandidatureEntity candidatureEntity);
    CandidatureEntity update(CandidatureEntity candidatureEntity);
    void deleteById(Long id);
}
