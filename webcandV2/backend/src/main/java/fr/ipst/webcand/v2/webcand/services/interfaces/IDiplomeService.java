package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDiplomeService {
    List<DiplomeEntity> getAll();
    DiplomeEntity findById(Long id);
    DiplomeEntity update(DiplomeEntity diplomeEntity);
    DiplomeEntity save(DiplomeEntity diplomeEntity);
    void deleteById(Long id);
}
