package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportCodeRepo extends JpaRepository<ReportCode, String> {

}
