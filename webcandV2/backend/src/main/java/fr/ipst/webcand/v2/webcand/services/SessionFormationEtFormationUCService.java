package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.IFormationRepository;
import fr.ipst.webcand.v2.webcand.repository.ISessionFormationRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ISessionFormationEtFormationUCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class SessionFormationEtFormationUCService implements ISessionFormationEtFormationUCService {

    @Autowired
    private IFormationRepository formationRepository;

    @Autowired
    private ISessionFormationRepository sessionRepository;

    public List<Map<String,Object>> AfficherLesSessionsDeLaFormation(Long id){
        return sessionRepository.AfficherLesSessionsDeLaFormation(id);
    }

    @Override
    public SessionFormationEntity AfficherLaSessionDuneFormation(Long idFormation, Long idSession) {
        FormationEntity formation = formationRepository.findById(idFormation).
                orElseThrow(() -> new RessourceNotFoundException("candidat", "id", "idFormation"));

        if (formation == null) {
            return null;
        }

        SessionFormationEntity session = sessionRepository.findById(idSession).
                orElseThrow(() -> new RessourceNotFoundException("sessionFormation", "id", "idSession"));

        if (session == null) {
            return null;
        }

        if (session.getFormation().getIdFormation() != idFormation) {
            return null;
        }

        return session;
    }

    public SessionFormationEntity addSession(Long idFormation, SessionFormationEntity session) {
        FormationEntity formation = formationRepository.findById(idFormation).
                orElseThrow(()->new RessourceNotFoundException("formation","id","idFormation"));

        if (formation == null) {
            return null;
        }

        formation.getSessions().add(session);
        session.setFormation(formation);

        return session;
    }

    public void removeSession(Long idFormation, Long idSession) {
        FormationEntity formation = formationRepository.findById(idFormation).
                orElseThrow(()->new RessourceNotFoundException("formation","id","idFormation"));

        if (formation == null) {
            return ;
        }
        SessionFormationEntity session = sessionRepository.findById(idSession).
                orElseThrow(()->new RessourceNotFoundException("session","id","idSession"));
        formation.getSessions().remove(session);
    }
}
