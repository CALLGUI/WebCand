package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import lombok.Data;

import java.util.Date;

@Data
public class SessionFormationDto {


    private Long id_Session_Formation;

    private String nomSession;

    private Date dateDebutSession;

    private Date dateFinSession;

    //private FormationEntity formationEntity;

}
