package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportCodeDto;
import org.mdt.aioceaneye.model.ReportCode;
import org.mdt.aioceaneye.repository.ReportCodeRepo;
import org.mdt.aioceaneye.service.ReportCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportCodeServiceImpl implements ReportCodeService {
    @Autowired
    private ReportCodeRepo repo;

    @Override
    public ReportCode save(ReportCodeDto dto) {
        return repo.save(ReportCode.builder()
                .docCode(dto.getDocCode())
                .docName(dto.getDocName())
                .build());
    }

    @Override
    public Optional<ReportCode> update(String code, ReportCodeDto dto) {
        return repo.findById(code).map(existing -> {
            existing.setDocName(dto.getDocName());
            return repo.save(existing);
        });
    }

    @Override
    public List<ReportCode> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ReportCode> findById(String code) {
        return repo.findById(code);
    }

    @Override
    public void delete(String code) {
        repo.deleteById(code);
    }
}
