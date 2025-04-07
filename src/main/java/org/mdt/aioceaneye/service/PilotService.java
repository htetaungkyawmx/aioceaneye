package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotDto;
import org.mdt.aioceaneye.model.Pilot;

import java.util.List;
import java.util.Optional;

public interface PilotService {
    Pilot save(PilotDto dto);
    Optional<Pilot> update(String id, PilotDto dto);
    List<Pilot> findAll();
    Optional<Pilot> findById(String id);
    void delete(String id);
}

