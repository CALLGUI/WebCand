package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import lombok.Data;

@Data
public class CandidatureDto {

    public enum Etat {
        En_cours_de_traitement, Recevable, Non_recevable
    }

    private Long idCandidature;

    private String dateCandidature;

    private String lienEntretien;

    private CandidatureEntity.Etat etat;

    /*private Long id_Candidat;*/

    /*private Long id_Session_Formation*/
}
