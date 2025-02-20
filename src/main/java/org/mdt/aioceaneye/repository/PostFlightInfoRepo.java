package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.PostFlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostFlightInfoRepo extends JpaRepository<PostFlightInfo,Long> {
}
