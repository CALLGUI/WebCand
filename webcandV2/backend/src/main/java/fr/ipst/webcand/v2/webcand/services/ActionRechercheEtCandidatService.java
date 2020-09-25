package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.IActionRechercheRepository;
import fr.ipst.webcand.v2.webcand.repository.ICandidatRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IActionRechercheEtCandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ActionRechercheEtCandidatService implements IActionRechercheEtCandidatService {

    @Autowired
    private ICandidatRepository candidatRepository;

    @Autowired
    private IActionRechercheRepository actionRechercheRepository;

    @Override
    public List<Map<String,Object>> afficherLesActionsRecherchesCandidat(Long idActionRecherche) {
        return actionRechercheRepository.afficherLesActionsRecherchesCandidat(idActionRecherche);
    }

    @Override
    public ActionRechercheEntity afficherUneActionRechercheCandidat(Long idCandidat, Long idActionRecherche) {
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));
        if (candidat == null) {
            return null;
        }
        ActionRechercheEntity actionRecherche = actionRechercheRepository.findById(idActionRecherche).
                orElseThrow(()->new RessourceNotFoundException("actionRecherche", "id", "idActionRecherche"));
        if (actionRecherche == null) {
            return null;
        }
        if (actionRecherche.getCandidat().getIdCandidat() != idCandidat) {
            return null;
        }
        return actionRecherche;
    }

    public ActionRechercheEntity addActionRecherche(Long idCandidat, ActionRechercheEntity actionRecherche) {
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat", "id", "idCandidat"));
        if (candidat == null) {
            return null;
        }
        candidat.getActionsRecherche().add(actionRecherche);

        return actionRecherche;
    }

    public void removeActionRecherche(Long idCandidat, Long idActionRecherche) {
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));
        if (candidat == null) {
            return;
        }
        ActionRechercheEntity actionRecherche = actionRechercheRepository.findById(idActionRecherche).
                orElseThrow(()->new RessourceNotFoundException("actionRecherche","id","idActionRecherche"));
        candidat.getActionsRecherche().remove(actionRecherche);
    }

    @Override
    public ActionRechercheEntity findById(Long id) {
        return actionRechercheRepository.getOne(id);
    }

}
