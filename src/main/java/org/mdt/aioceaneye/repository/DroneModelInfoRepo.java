package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.DroneModelInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneModelInfoRepo extends JpaRepository<DroneModelInfo,String> {
}
