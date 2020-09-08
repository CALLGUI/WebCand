package fr.ipst.webcand.v2.webcand.dto;

import lombok.Data;

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
}
