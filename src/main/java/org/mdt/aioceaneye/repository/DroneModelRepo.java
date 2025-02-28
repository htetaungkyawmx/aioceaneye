package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.DroneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneModelRepo extends JpaRepository<DroneModel,String> {
}
