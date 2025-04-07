package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotLogDto;
import org.mdt.aioceaneye.model.PilotLog;

import java.util.List;
import java.util.Optional;

public interface PilotLogService {
    PilotLog save(PilotLogDto dto);
    Optional<PilotLog> update(String id, PilotLogDto dto);
    List<PilotLog> findAll();
    Optional<PilotLog> findById(String id);
    void delete(String id);
}

