package fr.ipst.webcand.v2.webcand.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "profils")
@Data
@EqualsAndHashCode(exclude = {"candidat"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class
        , property = "idProfil", scope = ProfilEntity.class)
public class ProfilEntity {

    @Id
    @Column(name = "id_profil")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfil;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_candidat", nullable = false)
    @JsonIgnore
    private CandidatEntity candidat;

}
