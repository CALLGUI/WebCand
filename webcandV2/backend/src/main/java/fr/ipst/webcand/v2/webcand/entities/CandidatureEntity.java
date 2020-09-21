package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "candidatures")
@Data
@EqualsAndHashCode(exclude = {"candidat", "sesssionFormation"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idCandidature", scope = CandidatureEntity.class)
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


                        /* Table d'associations et relations */
    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName ="id_candidat" ,name = "id_candidat", nullable=false)
    @JsonIgnore
    private CandidatEntity candidat;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName ="id_session_formation",name="id_session", nullable=false)
    @JsonIgnoreProperties("candidatures")
    private SessionFormationEntity sesssionFormation;

}
