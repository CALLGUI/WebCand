package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import lombok.Data;

import java.util.Set;

@Data
public class FormationDto {

    private long id_Formation;

    private String intitule_Formation;

    private String description_Formation;

    private Set<EnseignantEntity> enseignants;
}
