package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.MaterialLog;
import org.mdt.aioceaneye.model.MaterialLogPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialLogRepo extends JpaRepository<MaterialLog, MaterialLogPk> {
}
