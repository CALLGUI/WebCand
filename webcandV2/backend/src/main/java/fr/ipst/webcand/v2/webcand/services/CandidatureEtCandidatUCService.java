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

import java.util.List;
import java.util.Map;


@Transactional
@Service
public class CandidatureEtCandidatUCService implements ICandidatureEtCandidatUCService {

    @Autowired
    private ICandidatRepository candidatRepository;

    @Autowired
    private ICandidatureRepository candidatureRepository;

    @Override
    public List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(Long idCandidature){
        return candidatureRepository.AfficherLesCandidaturesDuCandidat(idCandidature);
    }

    @Override
    public CandidatureEntity AfficherLaCandidatureDuCandidat(Long idCandidat, Long idCandidature) {
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));

        if(candidat == null){return null;}

        CandidatureEntity candidature = candidatureRepository.findById(idCandidature).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));

        if(candidature == null){return null;}

        if (candidature.getCandidat().getIdCandidat() != idCandidat ) {
            return null;
        }

        return candidature;
    }

    public CandidatureEntity addCandidature(Long idCandidat, CandidatureEntity candidature){
        CandidatEntity candidat = candidatRepository.findById(idCandidat).
                orElseThrow(()->new RessourceNotFoundException("candidat","id","idCandidat"));

        if(candidat == null){
            return null;
        }


        List<CandidatureEntity> candidatures = candidat.getCandidatures();
        //limitations du nombre des candidatures par candidat a 1 candidature
        if(candidatures.size() != 0){
            return null ;
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

    @Override
    public CandidatureEntity findById(Long id) {
        return candidatureRepository.getOne(id);
    }
}
