package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import fr.ipst.webcand.v2.webcand.repository.IActionRechercheRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IActionRechercheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ActionRechercheService implements IActionRechercheService {

    @Autowired
    private IActionRechercheRepository actionRechercheRepository;


    @Override
    public List<ActionRechercheEntity> getAll() {
        return actionRechercheRepository.findAll();
    }

    @Override
    public ActionRechercheEntity findById(Long id) {
        return actionRechercheRepository.getOne(id);
    }

    @Override
    public ActionRechercheEntity save(ActionRechercheEntity newActionRechercheEntity) {
        return actionRechercheRepository.save(newActionRechercheEntity);
    }

    @Override
    public ActionRechercheEntity update(ActionRechercheEntity actionRechercheEntity) {
        return actionRechercheRepository.saveAndFlush(actionRechercheEntity);
    }

    @Override
    public void deleteById(Long id) {
        actionRechercheRepository.deleteById(id);
    }

    public List<Map<String,Object>> AfficherListeEntreprisesContacte(long id) {
        return actionRechercheRepository.AfficherListeEntreprisesContacte(id);
    }

    public List<Map<String, Object>> AfficherListeEntrepriseContacteDetails(long id) {
        return actionRechercheRepository.AfficherListeEntrepriseContacteDetails(id);
    }

}
