package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import lombok.Data;

import java.util.Set;

@Data
public class FormationDto {

    private long idFormation;

    private String nomFormation;

    private String descriptionFormation;

    private Set<EnseignantEntity> enseignants;
}
