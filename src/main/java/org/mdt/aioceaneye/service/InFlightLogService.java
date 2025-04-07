package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.InFlightLogDto;
import org.mdt.aioceaneye.model.InFlightLog;

import java.util.List;
import java.util.Optional;

public interface InFlightLogService {
    InFlightLog save(InFlightLogDto dto);
    Optional<InFlightLog> update(String id, InFlightLogDto dto);
    List<InFlightLog> findAll();
    Optional<InFlightLog> findById(String id);
    void delete(String id);
}
