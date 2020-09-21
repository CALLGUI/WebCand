package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISessionFormationService {

    List<SessionFormationEntity> getAll();
    SessionFormationEntity findById(Long id);
    SessionFormationEntity save(SessionFormationEntity sessionFormationEntity);
    SessionFormationEntity update(SessionFormationEntity sessionFormationEntity);
    void deleteById(Long id);

    List<SessionFormationEntity> findByDateDebutSession(String dateDebut);
    List<SessionFormationEntity> findByDateFinSession(String dateFin);
}
