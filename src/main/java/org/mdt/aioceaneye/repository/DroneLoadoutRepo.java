package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.DroneLoadoutKey;
import org.mdt.aioceaneye.model.DroneLoadout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneLoadoutRepo extends JpaRepository<DroneLoadout, DroneLoadoutKey> {

}
