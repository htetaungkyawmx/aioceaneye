package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PostFlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostFlightInfoRepo extends JpaRepository<PostFlightInfo,Long> {
}
