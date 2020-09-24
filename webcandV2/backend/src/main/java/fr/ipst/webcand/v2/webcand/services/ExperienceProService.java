package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import fr.ipst.webcand.v2.webcand.repository.IExperienceProRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IExperienceProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ExperienceProService implements IExperienceProService {

    @Autowired
    private IExperienceProRepository experienceProRepository;

    @Override
    public List<ExperienceProEntity> getAll() {
        return experienceProRepository.findAll();
    }

    @Override
    public ExperienceProEntity findById(Long id) {
        return experienceProRepository.getOne(id);
    }

    @Override
    public ExperienceProEntity update(ExperienceProEntity experienceProEntity) {
        return experienceProRepository.saveAndFlush(experienceProEntity);
    }

    @Override
    public ExperienceProEntity save(ExperienceProEntity experienceProEntity) {
        return experienceProRepository.save(experienceProEntity);
    }

    @Override
    public void deleteById(Long id) {
        experienceProRepository.deleteById(id);
    }

}
