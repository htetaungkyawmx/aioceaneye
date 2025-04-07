package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.FlightLogDto;
import org.mdt.aioceaneye.model.FlightLog;

import java.util.List;
import java.util.Optional;

public interface FlightLogService {
    FlightLog save(FlightLogDto dto);
    Optional<FlightLog> update(String id, FlightLogDto dto);
    List<FlightLog> findAll();
    Optional<FlightLog> findById(String id);
    void delete(String id);
}
