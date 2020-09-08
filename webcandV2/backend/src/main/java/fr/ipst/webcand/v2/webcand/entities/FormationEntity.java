package fr.ipst.webcand.v2.webcand.entities;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="formations")
@Data
@SQLDelete(sql = "DELETE FROM formations WHERE id_formation = ?")
public class FormationEntity {

    @Id
    @Column(name = "id_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFormation;

    @Column(name="nom_formation")
    private String nomFormation;

    @Column(name="description_formation")
    private String descriptionFormation;

    @ManyToMany(mappedBy = "formations")
    private Set<EnseignantEntity> enseignants = new HashSet<>();

    public Set<EnseignantEntity> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Set<EnseignantEntity> enseignants) {
        this.enseignants = enseignants;
    }
}
