package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import lombok.Data;

@Data
public class SessionFormationDto {


    private Long id_Session_Formation;

    private String nomSession;

    private String dateDebutSession;

    private String dateFinSession;

    //private FormationEntity formationEntity;

}
