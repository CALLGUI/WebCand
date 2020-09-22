package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import lombok.Data;

@Data
public class ProfilDto {

    private Long idProfil;

    private CandidatEntity candidat;

}
