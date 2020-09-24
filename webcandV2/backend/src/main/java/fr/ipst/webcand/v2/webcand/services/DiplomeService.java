package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import fr.ipst.webcand.v2.webcand.repository.IDiplomeRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IDiplomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class DiplomeService implements IDiplomeService {

    @Autowired
    private IDiplomeRepository diplomeRepository;

    @Override
    public List<DiplomeEntity> getAll() {
        return diplomeRepository.findAll();
    }

    @Override
    public DiplomeEntity findById(Long id) {
        return diplomeRepository.getOne(id);
    }

    @Override
    public DiplomeEntity update(DiplomeEntity diplomeEntity) {
        return diplomeRepository.saveAndFlush(diplomeEntity);
    }

    @Override
    public DiplomeEntity save(DiplomeEntity diplomeEntity) {
        return diplomeRepository.save(diplomeEntity);
    }

    @Override
    public void deleteById(Long id) {
        diplomeRepository.deleteById(id);
    }

}
