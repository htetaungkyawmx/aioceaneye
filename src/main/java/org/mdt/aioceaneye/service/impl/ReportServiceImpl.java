package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportDto;
import org.mdt.aioceaneye.model.Report;
import org.mdt.aioceaneye.repository.ReportRepo;
import org.mdt.aioceaneye.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepo repo;

    @Override
    public Report save(ReportDto dto) {
        return repo.save(Report.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .title(dto.getTitle())
                .docUser(dto.getDocUser())
                .docAt(dto.getDocAt())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Report> update(String docNo, ReportDto dto) {
        return repo.findById(docNo).map(existing -> {
            existing.setTitle(dto.getTitle());
            existing.setDocUser(dto.getDocUser());
            existing.setDocCode(dto.getDocCode());
            existing.setDocAt(dto.getDocAt());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Report> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Report> findById(String docNo) {
        return repo.findById(docNo);
    }

    @Override
    public void delete(String docNo) {
        repo.deleteById(docNo);
    }
}
