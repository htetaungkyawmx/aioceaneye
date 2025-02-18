package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportAccidents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportAccidentsRepo extends JpaRepository<ReportAccidents,Long> {
}
