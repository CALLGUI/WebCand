package fr.ipst.webcand.v2.webcand.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "enseignants")
@Data
@SQLDelete(sql = "DELETE FROM enseignants WHERE id_enseignant = ?")
public class EnseignantEntity {

    public enum Statut {
        Enseignant, ResponsableDeFormation, ResponsableEtEnseignant
    }

    @Id
    @Column(name = "id_enseignant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Enseignant;

    @Column(name = "nom_Enseignant")
    private String nom_Enseignant;

    @Column(name = "prenom_Enseignant")
    private String prenom_Enseignant;

    @Column(name = "titre_Enseignant")
    private String titre_Enseignant;

    @Column(name = "statut_Enseignant")
    @Enumerated(EnumType.STRING)
    @NotNull
    private EnseignantEntity.Statut statut;


}
