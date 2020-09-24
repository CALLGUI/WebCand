package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import lombok.Data;

import java.util.List;

@Data
public class ProfilDto {

    private Long idProfil;

    private CandidatEntity candidat;

    private List<DiplomeEntity> diplomes;

    private List<ExperienceProDto> expPro;

}
