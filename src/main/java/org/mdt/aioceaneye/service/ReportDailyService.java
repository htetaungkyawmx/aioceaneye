package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportDailyDto;
import org.mdt.aioceaneye.model.ReportDaily;

import java.util.List;
import java.util.Optional;

public interface ReportDailyService {
    ReportDaily save(ReportDailyDto dto);
    Optional<ReportDaily> update(String id, ReportDailyDto dto);
    List<ReportDaily> findAll();
    Optional<ReportDaily> findById(String id);
    void delete(String id);
}
