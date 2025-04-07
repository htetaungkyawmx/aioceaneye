package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportRequestDto;
import org.mdt.aioceaneye.model.ReportRequest;
import org.mdt.aioceaneye.repository.ReportRequestRepo;
import org.mdt.aioceaneye.service.ReportRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportRequestServiceImpl implements ReportRequestService {

    @Autowired
    private ReportRequestRepo repo;

    @Override
    public ReportRequest save(ReportRequestDto dto) {
        return repo.save(ReportRequest.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .coId(dto.getCoId())
                .docManager(dto.getDocManager())
                .docRequester(dto.getDocRequester())
                .docContent(dto.getDocContent())
                .docAt(dto.getDocAt())
                .docApprover(dto.getDocApprover())
                .docSignstatus(dto.getDocSignstatus())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<ReportRequest> update(String id, ReportRequestDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDocCode(dto.getDocCode());
            existing.setCoId(dto.getCoId());
            existing.setDocManager(dto.getDocManager());
            existing.setDocRequester(dto.getDocRequester());
            existing.setDocContent(dto.getDocContent());
            existing.setDocAt(dto.getDocAt());
            existing.setDocApprover(dto.getDocApprover());
            existing.setDocSignstatus(dto.getDocSignstatus());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<ReportRequest> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ReportRequest> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
