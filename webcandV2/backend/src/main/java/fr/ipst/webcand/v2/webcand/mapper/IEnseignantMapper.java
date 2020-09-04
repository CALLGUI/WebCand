package fr.ipst.webcand.v2.webcand.mapper;

import fr.ipst.webcand.v2.webcand.dto.EnseignantDto;
import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEnseignantMapper {
    EnseignantDto entiteVersDto(EnseignantEntity enseignantEntity);
    EnseignantEntity dtoVersEntite(EnseignantDto enseignantDto);
    List<EnseignantDto> listeEntiteVersListeDto(List<EnseignantEntity> enseignantEntities);
    //DataTablesOutput<EnseignantDto> entiteVersListeDtoTriee(DataTablesOutput<EnseignantEntity> dataTablesOutput);
}
