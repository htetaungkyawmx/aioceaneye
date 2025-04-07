package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportAccidentDto;
import org.mdt.aioceaneye.model.ReportAccident;
import org.mdt.aioceaneye.repository.ReportAccidentRepo;
import org.mdt.aioceaneye.service.ReportAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportAccidentServiceImpl implements ReportAccidentService {

    @Autowired
    private ReportAccidentRepo repo;

    @Override
    public ReportAccident save(ReportAccidentDto dto) {
        return repo.save(ReportAccident.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .droneId(dto.getDroneId())
                .docType(dto.getDocType())
                .docAction(dto.getDocAction())
                .docCause(dto.getDocCause())
                .docContent(dto.getDocContent())
                .docApprover(dto.getDocApprover())
                .docSignstatus(dto.getDocSignstatus())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<ReportAccident> update(String id, ReportAccidentDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDocCode(dto.getDocCode());
            existing.setDroneId(dto.getDroneId());
            existing.setDocType(dto.getDocType());
            existing.setDocAction(dto.getDocAction());
            existing.setDocCause(dto.getDocCause());
            existing.setDocContent(dto.getDocContent());
            existing.setDocApprover(dto.getDocApprover());
            existing.setDocSignstatus(dto.getDocSignstatus());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<ReportAccident> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ReportAccident> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
