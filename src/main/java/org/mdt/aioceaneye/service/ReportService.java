package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportDto;
import org.mdt.aioceaneye.model.Report;

import java.util.List;
import java.util.Optional;

public interface ReportService {
    Report save(ReportDto dto);
    Optional<Report> update(String docNo, ReportDto dto);
    List<Report> findAll();
    Optional<Report> findById(String docNo);
    void delete(String docNo);
}
