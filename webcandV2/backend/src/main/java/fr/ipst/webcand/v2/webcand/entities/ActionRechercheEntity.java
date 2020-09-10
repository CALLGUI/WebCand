package fr.ipst.webcand.v2.webcand.entities;


import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "actions_recherche")
@Data
@SQLDelete(sql = "DELETE FROM actions_recherche WHERE id_action_recherche = ?")
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

    @Column(name = "telephone_Contact")
    private String telephonneContact;

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

/*    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private CandidatEntity candidatEntity;*/

}
