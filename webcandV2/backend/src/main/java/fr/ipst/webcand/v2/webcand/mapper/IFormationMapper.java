package fr.ipst.webcand.v2.webcand.mapper;

import fr.ipst.webcand.v2.webcand.dto.FormationDto;
import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFormationMapper {
    FormationDto entiteVersDto(FormationEntity FormationEntity);
    FormationEntity dtoVersEntite(FormationDto FormationDto);
    List<FormationDto> listeEntiteVersListeDto(List<FormationEntity> formationEntities);
}
