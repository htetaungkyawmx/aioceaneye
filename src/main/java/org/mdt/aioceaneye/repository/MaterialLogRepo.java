package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.MaterialLogKey;
import org.mdt.aioceaneye.model.MaterialLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialLogRepo extends JpaRepository<MaterialLog, MaterialLogKey> {
}
