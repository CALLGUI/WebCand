package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
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

    private CandidatEntity cCandidat;

    private SessionFormationEntity cSessionFormation;

}
