package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PreFlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreFlightInfoRepo extends JpaRepository<PreFlightInfo,Long> {
}
