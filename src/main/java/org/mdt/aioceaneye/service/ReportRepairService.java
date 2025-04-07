package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportRepairDto;
import org.mdt.aioceaneye.model.ReportRepair;

import java.util.List;
import java.util.Optional;

public interface ReportRepairService {
    ReportRepair save(ReportRepairDto dto);
    Optional<ReportRepair> update(String id, ReportRepairDto dto);
    List<ReportRepair> findAll();
    Optional<ReportRepair> findById(String id);
    void delete(String id);
}
