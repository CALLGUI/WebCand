package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "candidats")
@Data
//@EqualsAndHashCode(exclude = {"cCandidatures"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idCandidat", scope = Long.class)
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


                        /* Table d'associations */
    @OneToMany(cascade= CascadeType.ALL)
    @JoinTable( name = "candidature_candidat_associations",
            joinColumns = @JoinColumn( name = "id_candidat" ),
            inverseJoinColumns = @JoinColumn( name = "id_candidature"))
    @JsonIgnoreProperties("cCandidat")
    private Set<CandidatureEntity> cCandidatures = new HashSet<>();

}
