package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="formations")
@Data
@EqualsAndHashCode(exclude = {"enseignants","sessions"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idFormation", scope = FormationEntity.class)
public class FormationEntity {

    @Id
    @Column(name = "id_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;

    @Column(name="nom_formation")
    private String nomFormation;

    @Column(name="description_formation")
    private String descriptionFormation;


                            /* Table d'associations et relations */
    @OneToMany(mappedBy = "formation", cascade =  CascadeType.ALL, orphanRemoval=true)
    private List<SessionFormationEntity> sessions;

    @ManyToMany(mappedBy = "formations", cascade = CascadeType.ALL)
    private List<EnseignantEntity> enseignants ;
}
