package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import lombok.Data;

@Data
public class ExperienceProDto {

    private Long idExpPro;

    private String nomEntreprise;

    private String poste;

    private String dateDebut;

    private String dateFin;

    private ProfilEntity profil;

}
