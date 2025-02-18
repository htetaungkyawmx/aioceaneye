package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportRepairs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepairsRepo extends JpaRepository<ReportRepairs,Long> {
}
