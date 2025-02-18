package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PreFlightLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreFlightLogRepo extends JpaRepository<PreFlightLog,Long> {
}
