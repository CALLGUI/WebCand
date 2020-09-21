package fr.ipst.webcand.v2.webcand.dto.mapper;

import fr.ipst.webcand.v2.webcand.dto.SessionFormationDto;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISessionFormationMapper {
    SessionFormationDto entiteVersDto(SessionFormationEntity sessionFormationEntity);
    SessionFormationEntity dtoVersEntite(SessionFormationDto sessionFormationDto);
    List<SessionFormationDto> listeEntiteVersListeDto(List<SessionFormationEntity> sessionFormationEntities);
}
