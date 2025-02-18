package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PostFlightLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostFlightLogRepo extends JpaRepository<PostFlightLog, Long> {
}
