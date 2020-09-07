package fr.ipst.webcand.v2.webcand.mapper;

import fr.ipst.webcand.v2.webcand.dto.CandidatureDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICandidatureMapper {
    CandidatureDto entiteVersDto(CandidatureEntity candidatureEntity);
    CandidatureEntity dtoVersEntite(CandidatureDto candidatureDto);
    List<CandidatureDto> listeEntiteVersListeDto(List<CandidatureEntity> candidatureEntities);
}
