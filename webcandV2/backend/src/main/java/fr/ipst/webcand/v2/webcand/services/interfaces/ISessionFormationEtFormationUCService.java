package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.stereotype.Service;

@Service
public interface ISessionFormationEtFormationUCService {

    void removeSession(Long idFormation, Long idSession);
    SessionFormationEntity addSession(Long idFormation, SessionFormationEntity session);
}
