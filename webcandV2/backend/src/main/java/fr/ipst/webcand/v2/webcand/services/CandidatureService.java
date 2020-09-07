package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.repository.CandidatureRepo;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CandidatureService implements ICandidatureService {

    @Autowired
    private CandidatureRepo candidatureRepository;

    @Override
    public List<CandidatureEntity> getAll() {
        return candidatureRepository.findAll();
    }

    @Override
    public CandidatureEntity findById(Long id) {
        return candidatureRepository.getOne(id);
    }

    @Override
    public CandidatureEntity save(CandidatureEntity newCandidature) {
        return candidatureRepository.save(newCandidature);
    }

    @Override
    public CandidatureEntity update(CandidatureEntity candidatureEntity) {
        return candidatureRepository.saveAndFlush(candidatureEntity);
    }

    @Override
    public void deleteById(Long id) {
        candidatureRepository.deleteById(id);
    }

}
