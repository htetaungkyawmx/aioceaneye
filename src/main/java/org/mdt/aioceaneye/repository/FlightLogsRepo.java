package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FlightLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightLogsRepo extends JpaRepository<FlightLogs, Long> {
}
