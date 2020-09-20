package fr.ipst.webcand.v2.webcand.dto.mapper;

import fr.ipst.webcand.v2.webcand.dto.CandidatDto;
import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICandidatMapper {
    CandidatDto entiteVersDto(CandidatEntity candidatEntity);
    CandidatEntity dtoVersEntite(CandidatDto candidatDto);
    List<CandidatDto> listeEntiteVersListeDto(List<CandidatEntity> candidatEntities);
    //DataTablesOutput<CandidatDto> entiteVersListeDtoTriee(DataTablesOutput<CandidatEntity> dataTablesOutput);
}