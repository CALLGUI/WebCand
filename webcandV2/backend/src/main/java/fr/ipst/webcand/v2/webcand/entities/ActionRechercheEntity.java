package fr.ipst.webcand.v2.webcand.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "actions_recherche")
@Data
@EqualsAndHashCode(exclude = {"candidat"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idActionRecherche", scope = ActionRechercheEntity.class)
public class ActionRechercheEntity {

    @Id
    @Column(name = "id_action_recherche")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActionRecherche;

    @Column(name = "nom_entreprise")
    private String nomEntreprise;

    @Column(name = "nom_contact")
    private String nomContact;

    @Column(name = "mail_contact")
    private String mailContact;

    @Column(name = "telephone_contact")
    private String telephoneContact;

    @Column(name = "date_contact")
    private String dateContact;

    @Column(name = "type_postuler")
    private String typePostuler;

    @Column(name = "nom_poste")
    private String nomPoste;

    @Column(name = "reponse_entreprise")
    private String reponseEntreprise;

    @Column(name = "date_reponse")
    private String dateReponse;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName ="id_candidat",name = "id_candidat", nullable=false )
    @JsonIgnore
    private CandidatEntity candidat;
}
