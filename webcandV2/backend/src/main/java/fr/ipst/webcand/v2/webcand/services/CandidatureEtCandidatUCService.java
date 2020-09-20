package fr.ipst.webcand.v2.webcand.services;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.exception.RessourceNotFoundException;
import fr.ipst.webcand.v2.webcand.repository.ICandidatRepository;
import fr.ipst.webcand.v2.webcand.repository.ICandidatureRepository;
import fr.ipst.webcand.v2.webcand.services.interfaces.ICandidatureEtCandidatUCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class CandidatureEtCandidatUCService implements ICandidatureEtCandidatUCService {

    @Autowired
    private ICandidatRepository candidatRepository;

    @Autowired
    private ICandidatureRepository candidatureRepository;

    public CandidatureEntity addCandidature(Long idCandidat, CandidatureEntity candidature){
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));

        if(candidat == null){
            return null;
        }

        candidat.getCandidatures().add(candidature);

        return candidature;
    }

    public void removeCandidature (Long idCandidat, Long idCandidature){
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));

        if(candidat == null){
            return ;
        }
        CandidatureEntity candidature = candidatureRepository.findById(idCandidature).
                orElseThrow(()->new RessourceNotFoundException("candidature","id","idCandidature"));
        candidat.getCandidatures().remove(candidature);
    }
}
