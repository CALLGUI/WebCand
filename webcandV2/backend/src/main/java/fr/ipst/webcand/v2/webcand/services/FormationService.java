package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import fr.ipst.webcand.v2.webcand.repository.FormationRepo;
import fr.ipst.webcand.v2.webcand.services.interfaces.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FormationService implements IFormationService {

    @Autowired
    private FormationRepo formationRepository;

    @Override
    public List<FormationEntity> getAll() {
        return formationRepository.findAll();
    }

    @Override
    public FormationEntity findById(Long id) {
        return formationRepository.getOne(id);
    }

    @Override
    public FormationEntity save(FormationEntity newCandidat) {
        return formationRepository.save(newCandidat);
    }

    @Override
    public FormationEntity update(FormationEntity FormationEntity) {
        return formationRepository.saveAndFlush(FormationEntity);
    }

    @Override
    public void deleteById(Long id) {
        formationRepository.deleteById(id);
    }

}
