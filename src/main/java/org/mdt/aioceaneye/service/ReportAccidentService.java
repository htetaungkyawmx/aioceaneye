package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportAccidentDto;
import org.mdt.aioceaneye.model.ReportAccident;

import java.util.List;
import java.util.Optional;

public interface ReportAccidentService {
    ReportAccident save(ReportAccidentDto dto);
    Optional<ReportAccident> update(String id, ReportAccidentDto dto);
    List<ReportAccident> findAll();
    Optional<ReportAccident> findById(String id);
    void delete(String id);
}
