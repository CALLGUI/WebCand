package fr.ipst.webcand.v2.webcand.dto;

import com.sun.istack.NotNull;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import lombok.Data;

import javax.persistence.*;

@Data
public class CandidatureDto {

    public enum Etat {
        En_cours_de_traitement, Recevable, Non_recevable
    }

    private Long id_Candidature;

    private String date_Candidature;

    private String lien_Entretien;

    /*private Long id_Candidat;*/

    /*private Long id_Session_Formation*/
}
