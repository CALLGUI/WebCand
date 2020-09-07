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
    private long id_Formation;

    @Column(name="intitule_formation")
    private String intitule_Formation;

    @Column(name="description_formation")
    private String description_Formation;

    @ManyToMany(mappedBy = "formations")
    private Set<EnseignantEntity> enseignants = new HashSet<>();

    public Set<EnseignantEntity> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Set<EnseignantEntity> enseignants) {
        this.enseignants = enseignants;
    }
}
