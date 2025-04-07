package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends JpaRepository<Report, String> {

}
