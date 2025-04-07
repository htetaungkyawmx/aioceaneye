package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ReportRepairDto;
import org.mdt.aioceaneye.model.ReportRepair;
import org.mdt.aioceaneye.repository.ReportRepairRepo;
import org.mdt.aioceaneye.service.ReportRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportRepairServiceImpl implements ReportRepairService {

    @Autowired
    private ReportRepairRepo repo;

    @Override
    public ReportRepair save(ReportRepairDto dto) {
        return repo.save(ReportRepair.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .droneId(dto.getDroneId())
                .docRepair(dto.getDocRepair())
                .docCause(dto.getDocCause())
                .docAction(dto.getDocAction())
                .docApprover(dto.getDocApprover())
                .docSignstatus(dto.getDocSignstatus())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<ReportRepair> update(String id, ReportRepairDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDocCode(dto.getDocCode());
            existing.setDroneId(dto.getDroneId());
            existing.setDocRepair(dto.getDocRepair());
            existing.setDocCause(dto.getDocCause());
            existing.setDocAction(dto.getDocAction());
            existing.setDocApprover(dto.getDocApprover());
            existing.setDocSignstatus(dto.getDocSignstatus());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<ReportRepair> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ReportRepair> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
