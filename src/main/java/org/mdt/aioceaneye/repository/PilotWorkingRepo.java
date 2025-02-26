package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PilotWorking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PilotWorkingRepo extends JpaRepository<PilotWorking,String> {
}
