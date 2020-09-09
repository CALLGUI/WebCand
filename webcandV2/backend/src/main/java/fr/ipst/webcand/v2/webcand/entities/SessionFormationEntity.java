package fr.ipst.webcand.v2.webcand.entities;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Entity
@Table(name = "session_formation")
@Data
@SQLDelete(sql = "DELETE FROM sessionFormation WHERE id_session_formation = ?")
public class SessionFormationEntity {

    @Id
    @Column(name = "id_session_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSessionFormation;

    @Column(name = "date_debut_Session")
    private String dateDebutSession;

    @Column(name = "date_fin_session")
    private String dateFinSession;

   @ManyToOne
    @JoinColumn(name = "id_formation", nullable=false )
    private FormationEntity formationEntity;



}
