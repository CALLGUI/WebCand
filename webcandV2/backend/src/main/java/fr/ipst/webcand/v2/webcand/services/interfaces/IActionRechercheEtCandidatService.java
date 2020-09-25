package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IActionRechercheEtCandidatService {
    ActionRechercheEntity findById(Long id);
    ActionRechercheEntity addActionRecherche(Long idCandidat, ActionRechercheEntity actionRecherche);
    void removeActionRecherche(Long idCandidat, Long idActionRecherche);
    List<Map<String,Object>> afficherLesActionsRecherchesCandidat(Long id);
    ActionRechercheEntity afficherUneActionRechercheCandidat(Long idCandidat, Long idActionRecherche);
}
