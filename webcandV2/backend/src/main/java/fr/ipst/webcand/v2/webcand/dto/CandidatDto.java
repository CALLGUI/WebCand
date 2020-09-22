package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
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

    private List<CandidatureEntity> candidatures;

    private List<ActionRechercheEntity> actionsRecherche;

    private List<ProfilEntity> profils;
}
