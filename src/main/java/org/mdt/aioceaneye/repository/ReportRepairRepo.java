package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportRepair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepairRepo extends JpaRepository<ReportRepair, String> {

}
