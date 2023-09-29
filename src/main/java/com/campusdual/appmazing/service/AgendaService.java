package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IAgendaService;
import com.campusdual.appmazing.model.Agenda;
import com.campusdual.appmazing.model.dao.AgendaDao;
import com.campusdual.appmazing.model.dto.AgendaDTO;
import com.campusdual.appmazing.model.dto.dtopmapper.AgendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceAgenda")
@Lazy
public class AgendaService implements IAgendaService {


    @Autowired
    private AgendaDao agendaDao;

    @Override
    public AgendaDTO queryAgenda(AgendaDTO agendaDTO) {
        Agenda agenda = AgendaMapper.INSTANCE.toEntity(agendaDTO);
        Agenda agendaFinal = this.agendaDao.getReferenceById(agenda.getId());
        return AgendaMapper.INSTANCE.toDTO(agendaFinal);
    }

    @Override
    public List<AgendaDTO> queryAllAgenda() {
        return AgendaMapper.INSTANCE.toDTOList(this.agendaDao.findAll());
    }

    @Override
    public int insertAgenda(AgendaDTO contactDTO) {
        Agenda contact = AgendaMapper.INSTANCE.toEntity(contactDTO);
        this.agendaDao.saveAndFlush(contact);
        return contact.getId();
    }

    @Override
    public int updateAgenda(AgendaDTO agendaDTO) {
        return this.insertAgenda(agendaDTO);
    }

    @Override
    public int deleteAgenda(AgendaDTO agenda) {
        int id = agenda.getId();
        Agenda agendaEntity = AgendaMapper.INSTANCE.toEntity(agenda);
        agendaDao.delete(agendaEntity);
        return id;
    }

}