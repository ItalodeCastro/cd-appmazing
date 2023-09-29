package com.campusdual.appmazing.model.dao;

import com.campusdual.appmazing.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaDao extends JpaRepository <Agenda, String> {
    Agenda getReferenceById(int id);
}

