package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import lombok.Data;

import java.util.List;

@Data
public class FormationDto {

    private Long idFormation;

    private String nomFormation;

    private String descriptionFormation;

    private List<EnseignantEntity> enseignants;

    private List<SessionFormationEntity> sessions;
}
