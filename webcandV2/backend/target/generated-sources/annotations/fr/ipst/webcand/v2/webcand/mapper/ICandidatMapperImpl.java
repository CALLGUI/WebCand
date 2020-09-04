package fr.ipst.webcand.v2.webcand.mapper;

import fr.ipst.webcand.v2.webcand.dto.CandidatDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-04T10:11:04+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class ICandidatMapperImpl implements ICandidatMapper {

    @Override
    public CandidatDto entiteVersDto(CandidatEntity candidatEntity) {
        if ( candidatEntity == null ) {
            return null;
        }

        CandidatDto candidatDto = new CandidatDto();

        candidatDto.setId_Candidat( candidatEntity.getId_Candidat() );
        candidatDto.setNom_Candidat( candidatEntity.getNom_Candidat() );
        candidatDto.setPrenom_Candidat( candidatEntity.getPrenom_Candidat() );
        candidatDto.setDate_Naissance_Candidat( candidatEntity.getDate_Naissance_Candidat() );
        candidatDto.setAdresse_Candidat( candidatEntity.getAdresse_Candidat() );
        candidatDto.setCode_Postal_Candidat( candidatEntity.getCode_Postal_Candidat() );
        candidatDto.setVille_Candidat( candidatEntity.getVille_Candidat() );
        candidatDto.setPays_Candidat( candidatEntity.getPays_Candidat() );
        candidatDto.setTelephone_Candidat( candidatEntity.getTelephone_Candidat() );

        return candidatDto;
    }

    @Override
    public CandidatEntity dtoVersEntite(CandidatDto candidatDto) {
        if ( candidatDto == null ) {
            return null;
        }

        CandidatEntity candidatEntity = new CandidatEntity();

        candidatEntity.setId_Candidat( candidatDto.getId_Candidat() );
        candidatEntity.setNom_Candidat( candidatDto.getNom_Candidat() );
        candidatEntity.setPrenom_Candidat( candidatDto.getPrenom_Candidat() );
        candidatEntity.setDate_Naissance_Candidat( candidatDto.getDate_Naissance_Candidat() );
        candidatEntity.setAdresse_Candidat( candidatDto.getAdresse_Candidat() );
        candidatEntity.setCode_Postal_Candidat( candidatDto.getCode_Postal_Candidat() );
        candidatEntity.setVille_Candidat( candidatDto.getVille_Candidat() );
        candidatEntity.setPays_Candidat( candidatDto.getPays_Candidat() );
        candidatEntity.setTelephone_Candidat( candidatDto.getTelephone_Candidat() );

        return candidatEntity;
    }

    @Override
    public List<CandidatDto> listeEntiteVersListeDto(List<CandidatEntity> candidatEntities) {
        if ( candidatEntities == null ) {
            return null;
        }

        List<CandidatDto> list = new ArrayList<CandidatDto>( candidatEntities.size() );
        for ( CandidatEntity candidatEntity : candidatEntities ) {
            list.add( entiteVersDto( candidatEntity ) );
        }

        return list;
    }
}
