package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.EdgeServerLogKey;
import org.mdt.aioceaneye.model.EdgeServerLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeServerLogRepo extends JpaRepository<EdgeServerLog, EdgeServerLogKey> {

}
