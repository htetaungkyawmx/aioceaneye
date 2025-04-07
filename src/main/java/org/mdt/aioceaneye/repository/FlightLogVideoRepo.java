package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FlightLogVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightLogVideoRepo extends JpaRepository<FlightLogVideo, String> {

}
