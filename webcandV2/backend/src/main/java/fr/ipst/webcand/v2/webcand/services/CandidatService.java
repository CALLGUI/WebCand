package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.repository.ICandidatRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class CandidatService implements ICandidatService {

    @Autowired
    private ICandidatRepository candidatRepository;

    @Override
    public List<CandidatEntity> getAll() {
        return candidatRepository.findAll();
    }

    @Override
    public CandidatEntity findById(Long id) {
        return candidatRepository.getOne(id);
    }

    @Override
    public CandidatEntity save(CandidatEntity newCandidat) {
        return candidatRepository.save(newCandidat);
    }

    @Override
    public CandidatEntity update(CandidatEntity candidatEntity) {
        return candidatRepository.saveAndFlush(candidatEntity);
    }

    @Override
    public void deleteById(Long id) {
        candidatRepository.deleteById(id);
    }

    public List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(Long id){
        return candidatRepository.AfficherLesCandidaturesDuCandidat(id);
    }

    /*@Override
    public DataTablesOutput<CandidatEntity> findAll(DataTablesInput input) {
        return candidatRepository.findAll(input);
    }*/

}
