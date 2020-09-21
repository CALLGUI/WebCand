package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IFormationService {
    List<FormationEntity> getAll();
    FormationEntity findById(Long id);
    FormationEntity save(FormationEntity formationEntity);
    FormationEntity update(FormationEntity formationEntity);
    void deleteById(Long id);

    List<Map<String,Object>> AfficherLeNomDesFormations();
    List<Map<String,Object>> AfficherInfoSessionEtFormation(Long id);
}
