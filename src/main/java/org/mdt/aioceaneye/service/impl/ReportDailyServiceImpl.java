package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportDailyDto;
import org.mdt.aioceaneye.model.ReportDaily;
import org.mdt.aioceaneye.repository.ReportDailyRepo;
import org.mdt.aioceaneye.service.ReportDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportDailyServiceImpl implements ReportDailyService {

    @Autowired
    private ReportDailyRepo repo;

    @Override
    public ReportDaily save(ReportDailyDto dto) {
        return repo.save(ReportDaily.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .shipId(dto.getShipId())
                .docAt(dto.getDocAt())
                .docReason(dto.getDocReason())
                .docWork(dto.getDocWork())
                .docProblem(dto.getDocProblem())
                .docApprover(dto.getDocApprover())
                .docSingstatus(dto.getDocSingstatus())
                .docEtccontent(dto.getDocEtccontent())
                .docRelated(dto.getDocRelated())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<ReportDaily> update(String id, ReportDailyDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDocCode(dto.getDocCode());
            existing.setShipId(dto.getShipId());
            existing.setDocAt(dto.getDocAt());
            existing.setDocReason(dto.getDocReason());
            existing.setDocWork(dto.getDocWork());
            existing.setDocProblem(dto.getDocProblem());
            existing.setDocApprover(dto.getDocApprover());
            existing.setDocSingstatus(dto.getDocSingstatus());
            existing.setDocEtccontent(dto.getDocEtccontent());
            existing.setDocRelated(dto.getDocRelated());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<ReportDaily> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ReportDaily> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
