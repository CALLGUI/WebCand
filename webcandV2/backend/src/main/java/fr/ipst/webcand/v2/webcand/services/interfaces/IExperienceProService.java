package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IExperienceProService {
    List<ExperienceProEntity> getAll();
    ExperienceProEntity findById(Long id);
    ExperienceProEntity update(ExperienceProEntity experienceProEntity);
    ExperienceProEntity save(ExperienceProEntity experienceProEntity);
    void deleteById(Long id);
}
