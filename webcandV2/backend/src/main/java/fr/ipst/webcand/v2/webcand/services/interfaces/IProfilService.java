package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProfilService {
    List<ProfilEntity> getAll();
    ProfilEntity findById(Long id);
    ProfilEntity save(ProfilEntity profilEntity);
    ProfilEntity update(ProfilEntity profilEntity);
    void deleteById(Long id);
}
