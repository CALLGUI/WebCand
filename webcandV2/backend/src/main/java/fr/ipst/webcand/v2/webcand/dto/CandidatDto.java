package fr.ipst.webcand.v2.webcand.dto;

import lombok.Data;

@Data
public class CandidatDto {

    private Long id_Candidat;
    
    private String nom_Candidat;

    private String prenom_Candidat;

    private String date_Naissance_Candidat;

    private String adresse_Candidat;

    private String code_Postal_Candidat;

    private String ville_Candidat;

    private String pays_Candidat;

    private String telephone_Candidat;
}
