package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.repository.ICandidatureRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CandidatureService implements ICandidatureService {

    @Autowired
    private ICandidatureRepository candidatureRepository;

    @Override
    public List<CandidatureEntity> getAll() {
        return candidatureRepository.findAll();
    }

    @Override
    public CandidatureEntity findById(Long id) {
        return candidatureRepository.getOne(id);
    }

    @Override
    public CandidatureEntity update(CandidatureEntity candidatureEntity) {
        return candidatureRepository.saveAndFlush(candidatureEntity);
    }

    @Override
    public CandidatureEntity save(CandidatureEntity candidatureEntity) {
        return candidatureRepository.save(candidatureEntity);
    }

    @Override
    public void deleteById(Long id) {
        candidatureRepository.deleteById(id);
    }

    public long count(){
        return candidatureRepository.count();
    };

    public long compterNombreDeCandidaturesParIdSession(Long idSessionFormation){
        return candidatureRepository.compterNombreDeCandidaturesParIdSession(idSessionFormation);
    }
}
