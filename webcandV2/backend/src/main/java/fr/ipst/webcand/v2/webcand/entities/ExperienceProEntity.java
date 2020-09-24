package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "experiences_pro")
@Data
@EqualsAndHashCode(exclude = {""})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idExpPro", scope = ExperienceProEntity.class)
public class ExperienceProEntity {

    @Id
    @Column(name = "id_exp_pro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExpPro;

    @Column(name = "nom_entreprise")
    private String nomEntreprise;

    @Column(name = "poste")
    private String poste;

    @Column(name = "date_debut")
    private String dateDebut;

    @Column(name = "date_fin")
    private String dateFin;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName ="id_profil" ,name = "id_profil", nullable=false)
    @JsonIgnore
    private ProfilEntity profil;

}
