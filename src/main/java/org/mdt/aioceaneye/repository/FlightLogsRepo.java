package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FlightLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightLogsRepo extends JpaRepository<FlightLogs, Long> {
}
