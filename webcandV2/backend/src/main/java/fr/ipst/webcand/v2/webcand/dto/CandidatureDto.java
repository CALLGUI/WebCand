package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import fr.ipst.webcand.v2.webcand.entities.enumerations.ValidationAdministrativeStatut;
import lombok.Data;

@Data
public class CandidatureDto {

    public enum Etat {
        En_cours_de_traitement, Recevable, Non_recevable
    }

    private Long idCandidature;

    private String dateCandidature;

    private String lienEntretien;

    private CandidatureEntity.Etat etat = CandidatureEntity.Etat.En_cours_de_traitement;

    private CandidatEntity candidat;

    private SessionFormationEntity sesssionFormation;

    private ValidationAdministrativeStatut validation;
}
