package fr.ipst.webcand.v2.webcand.dto;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import lombok.Data;

@Data
public class DiplomeDto {

    private Long idDiplome;

    private String nomDiplome;

    private String nomEtablissement;

    private String dateDebut;

    private String dateFin;

    private ProfilEntity profil;

}
