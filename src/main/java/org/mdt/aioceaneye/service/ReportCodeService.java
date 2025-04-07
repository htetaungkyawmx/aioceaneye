package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ReportCodeDto;
import org.mdt.aioceaneye.model.ReportCode;

import java.util.List;
import java.util.Optional;

public interface ReportCodeService {
    ReportCode save(ReportCodeDto dto);
    Optional<ReportCode> update(String code, ReportCodeDto dto);
    List<ReportCode> findAll();
    Optional<ReportCode> findById(String code);
    void delete(String code);
}
