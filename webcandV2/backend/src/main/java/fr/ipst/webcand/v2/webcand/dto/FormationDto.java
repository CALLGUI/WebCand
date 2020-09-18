package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import lombok.Data;

import java.util.Set;

@Data
public class FormationDto {

    private Long idFormation;

    private String nomFormation;

    private String descriptionFormation;

    private Set<EnseignantEntity> enseignants;

    private Set<SessionFormationEntity> sSessionFormation;
}
