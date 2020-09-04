package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEnseignantService {
    List<EnseignantEntity> getAll();
    EnseignantEntity findById(Long id);
    EnseignantEntity save(EnseignantEntity enseignantEntity);
    EnseignantEntity update(EnseignantEntity enseignantEntity);
    void deleteById(Long id);
}
