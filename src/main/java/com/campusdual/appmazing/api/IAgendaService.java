package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.AgendaDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;

import java.util.List;

    public interface IAgendaService {
        AgendaDTO queryAgenda (AgendaDTO agendaDTO);
        List<AgendaDTO > queryAllAgenda ();

        int insertAgenda   (AgendaDTO agenda);

        int updateAgenda (AgendaDTO agenda);
        int deleteAgenda (AgendaDTO agenda);




    }


