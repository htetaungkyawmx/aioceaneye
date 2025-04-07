package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.WorkScheduleDto;
import org.mdt.aioceaneye.model.WorkSchedule;

import java.util.List;
import java.util.Optional;

public interface WorkScheduleService {
    WorkSchedule save(WorkScheduleDto dto);
    Optional<WorkSchedule> update(String code, WorkScheduleDto dto);
    List<WorkSchedule> findAll();
    Optional<WorkSchedule> findById(String code);
    void delete(String code);
}
