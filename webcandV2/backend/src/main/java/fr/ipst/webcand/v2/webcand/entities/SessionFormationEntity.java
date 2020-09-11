package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sessions_formation")
@Data
@EqualsAndHashCode(exclude = {"sessionCandidatures"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idSessionFormation", scope = Long.class)
@SQLDelete(sql = "DELETE FROM sessionFormation WHERE id_session_formation = ?")
public class SessionFormationEntity {

    @Id
    @Column(name = "id_session_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSessionFormation;

    @Column(name = "date_debut_Session")
    private String dateDebutSession;

    @Column(name = "date_fin_session")
    private String dateFinSession;


                            /* Table d'associations */
    @ManyToOne
    @JoinColumn(name = "id_formation", nullable=false )
    @JsonIgnoreProperties
    private FormationEntity formationEntity;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinTable( name = "candidature_session_associations",
            joinColumns = @JoinColumn( name = "id_session_formation" ),
            inverseJoinColumns = @JoinColumn( name = "id_candidature"))
    @JsonIgnoreProperties("cSessionFormation")
    private Set<CandidatureEntity> sessionCandidatures = new HashSet<>();


}
