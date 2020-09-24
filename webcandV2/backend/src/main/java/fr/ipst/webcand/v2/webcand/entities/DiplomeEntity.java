package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "diplomes")
@Data
@EqualsAndHashCode(exclude = {""})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idDiplome", scope = DiplomeEntity.class)
public class DiplomeEntity {

    @Id
    @Column(name = "id_diplome")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiplome;

    @Column(name = "nom_diplome")
    private String nomDiplome;

    @Column(name = "nom_etablissement")
    private String nomEtablissement;

    @Column(name = "date_debut")
    private String dateDebut;

    @Column(name = "date_fin")
    private String dateFin;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName ="id_profil" ,name = "id_profil", nullable=false)
    @JsonIgnore
    private ProfilEntity profil;

}
