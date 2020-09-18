package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.repository.ICandidatureRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CandidatureService implements ICandidatureService {

    @Autowired
    private ICandidatureRepository candidatureRepository;

    @Override
    public List<CandidatureEntity> getAll() {
        return candidatureRepository.findAll();
    }

    @Override
    public CandidatureEntity findById(Long id) {
        return candidatureRepository.getOne(id);
    }

    @Override
    public CandidatureEntity update(CandidatureEntity candidatureEntity) {
        return candidatureRepository.saveAndFlush(candidatureEntity);
    }

    @Override
    public CandidatureEntity save(CandidatureEntity candidatureEntity) {
        return candidatureRepository.save(candidatureEntity);
    }

    @Override
    public void deleteById(Long id) {
        candidatureRepository.deleteById(id);
    }
    /*
    @Override
    public CandidatureEntity save(CandidatureEntity newCandidature){
        CandidatEntity temp = newCandidature.getCCandidat();
        temp.addCandidature(newCandidature);
        return candidatureRepository.save(newCandidature);
    }

    @Override
    public void deleteById(Long id) {
        CandidatureEntity effaceur = findById(id);
        CandidatEntity temp = effaceur.getCCandidat();
        temp.removeCandidature(effaceur);
        candidatureRepository.deleteById(id);
    }
    */

    /*
    public void createCandidatureSessionAssociation(Long idCandidature, Long idSessionFormation) {
        candidatureRepository.createCandidatureSessionAssociation(idCandidature, idSessionFormation);
    }

    public void createCandidatureCandidatAssociation(Long idCandidature, Long idCandidat) {
        candidatureRepository.createCandidatureCandidatAssociation(idCandidature, idCandidat);
    }*/

    /*
    public void createCandidatureWithAssociation(String jourJ, Long idSessionFormation,Long idCandidat) {
        ;

        //long idCandidature, long idSessionFormation
        createCandidatureSessionAssociation(this.creationCandidature(jourJ).getIdCandidature(),idSessionFormation);

        //long idCandidature, long idCandidat;
        createCandidatureCandidatAssociation(candidature.getIdCandidature(), idCandidat);
    }*/
}
