package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import lombok.Data;

import java.util.Set;

@Data
public class EnseignantDto {

    public enum Statut {
        Enseignant, Responsable_De_Formation, Responsable_Et_Enseignant
    }

    private Long idEnseignant;

    private String nomEnseignant;

    private String prenomEnseignant;

    private String titreEnseignant;

    private EnseignantEntity.Statut statut;

    private Set<FormationEntity> formations;
}
