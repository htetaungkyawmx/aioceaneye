package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRequestRepo extends JpaRepository<ReportRequest, String> {

}
