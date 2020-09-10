package fr.ipst.webcand.v2.webcand.mapper;


import fr.ipst.webcand.v2.webcand.dto.ActionRechercheDto;
import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IActionRechercheMapper {
    ActionRechercheDto entiteVersDto(ActionRechercheEntity actionRechercheEntity);
    ActionRechercheEntity dtoVersEntite(ActionRechercheDto actionRechercheDto);
    List<ActionRechercheDto> listeEntiteVersListeDto(List<ActionRechercheEntity> actionRechercheEntities);
}
