package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import lombok.Data;

import java.util.List;

@Data
public class SessionFormationDto {

    private Long idSessionFormation;

    private String dateDebutSession;

    private String dateFinSession;

    private FormationEntity formation;

    private List<CandidatureEntity> candidatures;
}
