package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import lombok.Data;

@Data
public class SessionFormationDto {

    private Long idSessionFormation;

    private String dateDebutSession;

    private String dateFinSession;

    private FormationEntity formationEntity;

}
