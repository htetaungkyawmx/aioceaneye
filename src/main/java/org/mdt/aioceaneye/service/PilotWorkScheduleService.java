package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotWorkScheduleDto;
import org.mdt.aioceaneye.model.PilotWorkSchedule;

import java.util.List;
import java.util.Optional;

public interface PilotWorkScheduleService {
    PilotWorkSchedule save(PilotWorkScheduleDto dto);
    Optional<PilotWorkSchedule> update(String id, PilotWorkScheduleDto dto);
    List<PilotWorkSchedule> findAll();
    Optional<PilotWorkSchedule> findById(String id);
    void delete(String id);
}
