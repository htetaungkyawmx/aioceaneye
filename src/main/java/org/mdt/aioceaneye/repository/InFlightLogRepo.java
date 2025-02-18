package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.InFlightLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InFlightLogRepo extends JpaRepository<InFlightLog,Long> {
}
