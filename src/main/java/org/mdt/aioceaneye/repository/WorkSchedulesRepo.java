package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.WorkSchedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkSchedulesRepo extends JpaRepository<WorkSchedules, Long> {
}
