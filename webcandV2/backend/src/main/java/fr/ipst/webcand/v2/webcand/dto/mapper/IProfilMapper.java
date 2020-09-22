package fr.ipst.webcand.v2.webcand.dto.mapper;

import fr.ipst.webcand.v2.webcand.dto.ProfilDto;
import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProfilMapper {

    ProfilDto entiteVersDto(ProfilEntity profilEntity);
    ProfilEntity dtoVersEntite(ProfilDto profilDto);
    List<ProfilDto> listeEntiteVersListeDto(List<ProfilEntity> profilEntities);

}
