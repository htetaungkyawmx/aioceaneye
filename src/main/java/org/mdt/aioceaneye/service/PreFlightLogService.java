package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PreFlightLogDto;
import org.mdt.aioceaneye.model.PreFlightLog;

import java.util.List;
import java.util.Optional;

public interface PreFlightLogService {
    PreFlightLog save(PreFlightLogDto dto);
    Optional<PreFlightLog> update(String id, PreFlightLogDto dto);
    List<PreFlightLog> findAll();
    Optional<PreFlightLog> findById(String id);
    void delete(String id);
}
