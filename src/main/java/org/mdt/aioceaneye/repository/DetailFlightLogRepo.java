package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.DetailFlightLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFlightLogRepo extends JpaRepository<DetailFlightLog,Long> {
}
