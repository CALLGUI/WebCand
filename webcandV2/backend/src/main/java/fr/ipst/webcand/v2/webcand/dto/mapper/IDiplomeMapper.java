package fr.ipst.webcand.v2.webcand.dto.mapper;

import fr.ipst.webcand.v2.webcand.dto.DiplomeDto;
import fr.ipst.webcand.v2.webcand.entities.DiplomeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDiplomeMapper {

    DiplomeDto entiteVersDto(DiplomeEntity diplomeEntity);
    DiplomeEntity dtoVersEntite(DiplomeDto diplomeDto);
    List<DiplomeDto> listeEntiteVersListeDto(List<DiplomeEntity> diplomeEntities);

}
