package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.WorkTransferDto;
import org.mdt.aioceaneye.model.WorkTransfer;

import java.util.List;
import java.util.Optional;

public interface WorkTransferService {
    WorkTransfer save(WorkTransferDto dto);
    Optional<WorkTransfer> update(String id, WorkTransferDto dto);
    List<WorkTransfer> findAll();
    Optional<WorkTransfer> findById(String id);
    void delete(String id);
}
