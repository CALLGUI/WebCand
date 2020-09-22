package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IActionRechercheService {
    List<ActionRechercheEntity> getAll();
    ActionRechercheEntity findById(Long id);
    ActionRechercheEntity save(ActionRechercheEntity actionRechercheEntity);
    ActionRechercheEntity update(ActionRechercheEntity actionRechercheEntity);
    void deleteById(Long id);
    List<Map<String,Object>> AfficherListeEntreprisesContacted(Long id);
    List<Map<String, Object>> AfficherListeEntrepriseContactedDetails(Long id);
}
