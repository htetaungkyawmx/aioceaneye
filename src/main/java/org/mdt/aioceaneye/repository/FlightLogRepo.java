package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FlightLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightLogRepo extends JpaRepository<FlightLog, String> {

}
