package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "enseignants")
@Data
@EqualsAndHashCode(exclude = {"formations"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idEnseignant", scope = Long.class)
@SQLDelete(sql = "DELETE FROM enseignants WHERE id_enseignant = ?")
public class EnseignantEntity {

    public enum Statut {
        Enseignant, Responsable_De_Formation, Responsable_Et_Enseignant
    }

    @Id
    @Column(name = "id_enseignant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;

    @Column(name = "nom_enseignant")
    private String nomEnseignant;

    @Column(name = "prenom_Enseignant")
    private String prenomEnseignant;

    @Column(name = "titre_enseignant")
    private String titreEnseignant;

    @Column(name = "statut_enseignant")
    @Enumerated(EnumType.STRING)
    private EnseignantEntity.Statut statut;


                            /* Table d'associations et relations */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jury",
            joinColumns = @JoinColumn(name = "id_Enseignant"),
            inverseJoinColumns = @JoinColumn(name = "id_Formation"))
    @JsonIgnoreProperties("enseignants")
    private Set<FormationEntity> formations = new HashSet<>();

}
