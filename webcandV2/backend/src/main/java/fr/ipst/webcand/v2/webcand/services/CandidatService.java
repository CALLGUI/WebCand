package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.repository.CandidatRepo;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CandidatService implements ICandidatService {

    @Autowired
    private CandidatRepo canidatRepository;

    @Override
    public List<CandidatEntity> getAll() {
        return canidatRepository.findAll();
    }

    /*@Override
    public DataTablesOutput<CandidatEntity> findAll(DataTablesInput input) {
        return canidatRepository.findAll(input);
    }*/

    @Override
    public CandidatEntity findById(Long id) {
        return canidatRepository.getOne(id);
    }

    @Override
    public CandidatEntity save(CandidatEntity newCandidat) {
        return canidatRepository.save(newCandidat);
    }

    @Override
    public CandidatEntity update(CandidatEntity candidatEntity) {
        return canidatRepository.saveAndFlush(candidatEntity);
    }

    @Override
    public void deleteById(Long id) {
        canidatRepository.deleteById(id);
    }

}
