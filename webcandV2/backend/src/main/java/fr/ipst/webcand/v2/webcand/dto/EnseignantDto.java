package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import lombok.Data;

@Data
public class EnseignantDto {

    public enum Statut {
        Enseignant, ResponsableDeFormation, ResponsableEtEnseignant
    }

    private Long id_Enseignant;

    private String nom_Enseignant;

    private String prenom_Enseignant;

    private String titre_Enseignant;

    private EnseignantEntity.Statut statut;
}
