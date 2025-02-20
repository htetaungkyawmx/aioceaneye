package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRequestsRepo extends JpaRepository<ReportRequests,Long> {
}
