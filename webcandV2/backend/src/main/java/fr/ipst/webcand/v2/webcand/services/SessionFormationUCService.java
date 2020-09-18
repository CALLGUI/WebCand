package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.IFormationRepository;
import fr.ipst.webcand.v2.webcand.repository.ISessionFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SessionFormationUCService {

    @Autowired
    private IFormationRepository formationRepository;

    @Autowired
    private ISessionFormationRepository sessionRepository;

    public SessionFormationEntity addSession(Long idFormation, SessionFormationEntity session) {
        FormationEntity formation = formationRepository.findById(idFormation).
                orElseThrow(()->new RessourceNotFoundException("formation","id","idFormation"));

        if (formation == null) {
            return null;
        }

        formation.getSessions().add(session);

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
