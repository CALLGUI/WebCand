package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="formations")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idFormation", scope = Long.class)
@SQLDelete(sql = "DELETE FROM formations WHERE id_formation = ?")
public class FormationEntity {

    @Id
    @Column(name = "id_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;

    @Column(name="nom_formation")
    private String nomFormation;

    @Column(name="description_formation")
    private String descriptionFormation;

    @ManyToMany(mappedBy = "formations")
    @JsonManagedReference(value = "enseignant-formation")
    private Set<EnseignantEntity> enseignants = new HashSet<>();
}
