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
    private Long id_Candidat;

    @Column(name = "nom_candidat")
    private String nom_Candidat;

    @Column(name = "prenom_candidat")
    private String prenom_Candidat;

    @Column(name = "date_Naissance_Candidat")
    private String date_Naissance_Candidat;

    @Column(name = "adresse_Candidat")
    private String adresse_Candidat;

    @Column(name = "code_Postal_Candidat")
    private String code_Postal_Candidat;

    @Column(name = "ville_Candidat")
    private String ville_Candidat;

    @Column(name = "pays_Candidat")
    private String pays_Candidat;

    @Column(name = "telephone_Candidat")
    private String telephone_Candidat;

}
