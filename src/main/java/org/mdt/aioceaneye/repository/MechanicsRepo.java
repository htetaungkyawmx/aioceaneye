package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.MaterialItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicsRepo extends JpaRepository<MaterialItems, Long> {
}
