package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.WorkTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTransferRepo extends JpaRepository<WorkTransfer, String> {

}
