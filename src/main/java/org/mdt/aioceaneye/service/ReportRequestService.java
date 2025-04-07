package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportRequestDto;
import org.mdt.aioceaneye.model.ReportRequest;

import java.util.List;
import java.util.Optional;

public interface ReportRequestService {
    ReportRequest save(ReportRequestDto dto);
    Optional<ReportRequest> update(String id, ReportRequestDto dto);
    List<ReportRequest> findAll();
    Optional<ReportRequest> findById(String id);
    void delete(String id);
}
