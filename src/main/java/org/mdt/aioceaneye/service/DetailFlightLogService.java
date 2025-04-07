package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DetailFlightLogDto;
import org.mdt.aioceaneye.model.DetailFlightLog;

import java.util.List;
import java.util.Optional;

public interface DetailFlightLogService {
    DetailFlightLog save(DetailFlightLogDto dto);
    Optional<DetailFlightLog> update(String id, DetailFlightLogDto dto);
    List<DetailFlightLog> findAll();
    Optional<DetailFlightLog> findById(String id);
    void delete(String id);
}
