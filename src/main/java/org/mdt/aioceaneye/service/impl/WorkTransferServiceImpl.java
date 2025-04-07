package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.WorkTransferDto;
import org.mdt.aioceaneye.model.WorkTransfer;
import org.mdt.aioceaneye.repository.WorkTransferRepo;
import org.mdt.aioceaneye.service.WorkTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkTransferServiceImpl implements WorkTransferService {

    @Autowired
    private WorkTransferRepo repo;

    @Override
    public WorkTransfer save(WorkTransferDto dto) {
        return repo.save(WorkTransfer.builder()
                .docNo(dto.getDocNo())
                .docCode(dto.getDocCode())
                .pilotNo(dto.getPilotNo())
                .docMission(dto.getDocMission())
                .docContent(dto.getDocContent())
                .docWork(dto.getDocWork())
                .docMemo(dto.getDocMemo())
                .docApprover(dto.getDocApprover())
                .docSignstatus(dto.getDocSignstatus())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<WorkTransfer> update(String id, WorkTransferDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDocCode(dto.getDocCode());
            existing.setPilotNo(dto.getPilotNo());
            existing.setDocMission(dto.getDocMission());
            existing.setDocContent(dto.getDocContent());
            existing.setDocWork(dto.getDocWork());
            existing.setDocMemo(dto.getDocMemo());
            existing.setDocApprover(dto.getDocApprover());
            existing.setDocSignstatus(dto.getDocSignstatus());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<WorkTransfer> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<WorkTransfer> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
