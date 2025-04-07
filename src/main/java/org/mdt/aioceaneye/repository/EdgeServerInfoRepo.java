package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.EdgeServerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeServerInfoRepo extends JpaRepository<EdgeServerInfo, Integer> {

}
