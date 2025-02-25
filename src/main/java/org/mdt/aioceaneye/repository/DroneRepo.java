package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepo extends JpaRepository<Drone, Long> {

}
