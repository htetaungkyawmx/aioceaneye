package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotSLogDto;
import org.mdt.aioceaneye.model.PilotSLog;

import java.util.List;
import java.util.Optional;

public interface PilotSLogService {
    PilotSLog save(PilotSLogDto dto);
    Optional<PilotSLog> update(String id, PilotSLogDto dto);
    List<PilotSLog> findAll();
    Optional<PilotSLog> findById(String id);
    void delete(String id);
}
