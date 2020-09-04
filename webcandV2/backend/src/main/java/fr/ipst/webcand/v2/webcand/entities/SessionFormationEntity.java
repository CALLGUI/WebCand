package fr.ipst.webcand.v2.webcand.entities;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sessionFormation")
@Data
@SQLDelete(sql = "DELETE FROM sessionFormation WHERE id_session_formation = ?")
public class SessionFormationEntity {

    @Id
    @Column(name = "id_session_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Session_Formation;

    @Column(name = "nomSession")
    private String nomSession;

    @Column(name = "dateDebutSession")
    private Date dateDebutSession;

    @Column(name = "dateFinSession")
    private Date dateFinSession;

   /* @ManyToOne
    @JoinColumn(name = "id_Formation")
    private FormationEntity formationEntity;*/

}
