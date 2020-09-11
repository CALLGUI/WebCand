package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "candidatures")
@Data
@EqualsAndHashCode(exclude = {"cCandidat", "cSessionFormation"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idCandidature", scope = Long.class)
@SQLDelete(sql = "DELETE FROM candidatures WHERE id_candidature = ?")
public class CandidatureEntity {

    public enum Etat {
        En_cours_de_traitement, Recevable, Non_recevable
    }

    @Id
    @Column(name = "id_candidature")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCandidature;

    @Column(name = "date_candidature")
    private String dateCandidature;

    @Column(name = "lien_entretien")
    private String lienEntretien;

    @Column(name = "etat_candidature")
    @Enumerated(EnumType.STRING)
    private CandidatureEntity.Etat etat = Etat.En_cours_de_traitement;

                        /* Table d'associations */
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("cCandidatures")
    private CandidatEntity cCandidat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("sessionCandidatures")
    private SessionFormationEntity cSessionFormation;

    /*@ManyToOne
    @JoinColumn(name = "fk_id_candidat")
    @JsonIgnoreProperties
    private CandidatEntity cCandidat;

    @ManyToOne
    @JoinColumn(name = "fk_id_session_formation")
    @JsonIgnoreProperties
    private SessionFormationEntity cSessionFormation;*/

}
