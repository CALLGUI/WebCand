package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import lombok.Data;

import java.util.Set;

@Data
public class CandidatDto {

    private Long idCandidat;
    
    private String nomCandidat;

    private String prenomCandidat;

    private String dateNaissanceCandidat;

    private String adresseCandidat;

    private String codePostalCandidat;

    private String villeCandidat;

    private String paysCandidat;

    private String telephoneCandidat;

    private Set<CandidatureEntity> candidatures;
}
