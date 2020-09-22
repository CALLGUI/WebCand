package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ISessionFormationEtFormationUCService {

    void removeSession(Long idFormation, Long idSession);
    SessionFormationEntity addSession(Long idFormation, SessionFormationEntity session);

    List<Map<String,Object>> AfficherLesSessionsDeLaFormation(Long id);
}
