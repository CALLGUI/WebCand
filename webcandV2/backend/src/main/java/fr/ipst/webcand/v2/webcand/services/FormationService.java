package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import fr.ipst.webcand.v2.webcand.repository.IFormationRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class FormationService implements IFormationService {

    @Autowired
    private IFormationRepository formationRepository;

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

    /*
    public List<String> findAllByNomFormation(){
        List<FormationEntity> l = formationRepository.findAllByNom_Formation();
        List<String> listeNomsFormations = new ArrayList<>();
        int i = l.size();
        while ( i != 0){
            FormationEntity fe = l.get(i);
            String nomfor = fe.getNom_Formation();
            listeNomsFormations.add(nomfor);
        }
        return listeNomsFormations;
    }*/

    public List<Map<String,Object>> testa(){
        return formationRepository.testa();
    }

}
