package fr.ipst.webcand.v2.webcand.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    //table d'association sans attribut autres que les FK : Enseignant <> Formation
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "jury",
            joinColumns = @JoinColumn(name = "id_Enseignant"),
            inverseJoinColumns = @JoinColumn(name = "id_Formation")
    )
    private Set<FormationEntity> formations = new HashSet<>();

    public void addFormation(FormationEntity formation) {
        formations.add(formation);
        formation.getEnseignants().add(this);
    }

    public void removeFormation(FormationEntity formation) {
        formations.remove(formation);
        formation.getEnseignants().remove(this);
    }
}
