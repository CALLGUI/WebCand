package fr.ipst.webcand.v2.webcand.dto.mapper;

import fr.ipst.webcand.v2.webcand.dto.ExperienceProDto;
import fr.ipst.webcand.v2.webcand.entities.ExperienceProEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IExperienceProMapper {

    ExperienceProDto entiteVersDto(ExperienceProEntity experienceProEntity);
    ExperienceProEntity dtoVersEntite(ExperienceProDto experienceProDto);
    List<ExperienceProDto> listeEntiteVersListeDto(List<ExperienceProEntity> experienceProEntities);

}
