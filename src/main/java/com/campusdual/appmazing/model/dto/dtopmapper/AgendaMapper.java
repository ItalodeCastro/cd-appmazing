package com.campusdual.appmazing.model.dto.dtopmapper;

import com.campusdual.appmazing.model.Agenda;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.AgendaDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AgendaMapper {
    AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);
    AgendaDTO toDTO(Agenda agenda);
    List<AgendaDTO> toDTOList(List<Agenda> agenda);
    Agenda toEntity (AgendaDTO agendaDTO);
}