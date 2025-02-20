package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ReportDaily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDailyRepo extends JpaRepository<ReportDaily,Long> {
}
