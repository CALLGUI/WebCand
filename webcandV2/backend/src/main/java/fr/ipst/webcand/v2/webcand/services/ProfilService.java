package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import fr.ipst.webcand.v2.webcand.repository.IProfilRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProfilService implements IProfilService {

    @Autowired
    private IProfilRepository profilRepository;

    @Override
    public List<ProfilEntity> getAll() {
        return profilRepository.findAll();
    }

    @Override
    public ProfilEntity findById(Long id) {
        return profilRepository.getOne(id);
    }

    @Override
    public ProfilEntity save(ProfilEntity newProfil) {
        return profilRepository.save(newProfil);
    }

    @Override
    public ProfilEntity update(ProfilEntity profilEntity) {
        return profilRepository.saveAndFlush(profilEntity);
    }

    @Override
    public void deleteById(Long id) {
        profilRepository.deleteById(id);
    }



}
