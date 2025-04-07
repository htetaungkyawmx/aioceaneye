package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportAccident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportAccidentRepo extends JpaRepository<ReportAccident, String> {

}
