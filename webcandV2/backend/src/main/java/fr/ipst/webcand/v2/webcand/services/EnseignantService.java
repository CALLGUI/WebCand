package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import fr.ipst.webcand.v2.webcand.repository.EnseignantRepo;
import fr.ipst.webcand.v2.webcand.services.interfaces.IEnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EnseignantService implements IEnseignantService {

    @Autowired
    private EnseignantRepo enseignantRepository;

    @Override
    public List<EnseignantEntity> getAll() {
        return enseignantRepository.findAll();
    }

    @Override
    public EnseignantEntity findById(Long id) {
        return enseignantRepository.getOne(id);
    }

    @Override
    public EnseignantEntity save(EnseignantEntity newEnseignant) {
        return enseignantRepository.save(newEnseignant);
    }

    @Override
    public EnseignantEntity update(EnseignantEntity enseignantEntity) {
        return enseignantRepository.saveAndFlush(enseignantEntity);
    }

    @Override
    public void deleteById(Long id) {
        enseignantRepository.deleteById(id);
    }
}
