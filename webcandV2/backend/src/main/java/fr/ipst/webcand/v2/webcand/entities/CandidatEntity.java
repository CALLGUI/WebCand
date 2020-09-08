package fr.ipst.webcand.v2.webcand.entities;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "candidats")
@Data
@SQLDelete(sql = "DELETE FROM candidats WHERE id_candidat = ?")
public class CandidatEntity {

    @Id
    @Column(name = "id_candidat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCandidat;

    @Column(name = "nom_candidat")
    private String nomCandidat;

    @Column(name = "prenom_candidat")
    private String prenomCandidat;

    @Column(name = "date_naissance_candidat")
    private String dateNaissanceCandidat;

    @Column(name = "adresse_candidat")
    private String adresseCandidat;

    @Column(name = "code_postal_candidat")
    private String codePostalCandidat;

    @Column(name = "ville_candidat")
    private String villeCandidat;

    @Column(name = "pays_candidat")
    private String paysCandidat;

    @Column(name = "telephone_candidat")
    private String telephoneCandidat;

}
