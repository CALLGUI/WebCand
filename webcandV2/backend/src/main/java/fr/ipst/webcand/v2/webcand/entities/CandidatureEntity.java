package fr.ipst.webcand.v2.webcand.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "candidatures")
@Data
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
    @NotNull
    private CandidatureEntity.Etat etat;

    /*@Column(name = "id_candidat")
    private Long id_Candidat;*/

    /*@Column(name = "id_session")
    private Long id_Session_Formation;*/


}
