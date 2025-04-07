package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkScheduleRepo extends JpaRepository<WorkSchedule, String> {

}
