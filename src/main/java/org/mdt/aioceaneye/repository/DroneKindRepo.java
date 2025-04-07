package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.DroneKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneKindRepo extends JpaRepository<DroneKind, Integer> {
}
