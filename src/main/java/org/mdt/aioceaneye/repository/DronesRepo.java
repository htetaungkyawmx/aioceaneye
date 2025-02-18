package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Drones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DronesRepo extends JpaRepository<Drones, Long> {
}
