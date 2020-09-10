package fr.ipst.webcand.v2.webcand.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import lombok.Data;

import java.util.List;

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

    @JsonIgnoreProperties("cCandidat")
    private List<CandidatureEntity> cCandidatures;
}
