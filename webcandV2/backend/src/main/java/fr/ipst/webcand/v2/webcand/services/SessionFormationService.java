package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.repository.ISessionFormationRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ISessionFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SessionFormationService implements ISessionFormationService {

    @Autowired
    private ISessionFormationRepository sessionFormationRepository;

    @Override
    public List<SessionFormationEntity> getAll() {
        return sessionFormationRepository.findAll();
    }

    @Override
    public SessionFormationEntity findById(Long id) {
        return sessionFormationRepository.getOne(id);
    }

    @Override
    public SessionFormationEntity save(SessionFormationEntity newSessionFormation) {
        return sessionFormationRepository.save(newSessionFormation);
    }

    @Override
    public SessionFormationEntity update(SessionFormationEntity sessionFormationEntity) {
        return sessionFormationRepository.saveAndFlush(sessionFormationEntity);
    }

    @Override
    public void deleteById(Long id) {
        sessionFormationRepository.deleteById(id);
    }

    // trouver une session par date debut
    public List<SessionFormationEntity> findByDateDebutSession(String dateDebut){
        return sessionFormationRepository.findByDateDebutSession(dateDebut);
    }

    // trouver une session par date fin
    public List<SessionFormationEntity> findByDateFinSession(String dateFin){
        return sessionFormationRepository.findByDateFinSession(dateFin);
    }
}
