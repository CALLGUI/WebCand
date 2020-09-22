package fr.ipst.webcand.v2.webcand.dto;


import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import lombok.Data;


@Data
public class ActionRechercheDto {

    private Long idActionRecherche;

    private String nomEntreprise;

    private String nomContact;

    private String mailContact;

    private String telephonneContact;

    private String dateContact;

    private String typePostuler;

    private String nomPoste;

    private String reponseEntreprise;

    private String dateReponse;

    private CandidatEntity candidat;

}
