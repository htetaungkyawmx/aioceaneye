package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FishInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishInfoRepo extends JpaRepository<FishInfo,Long> {
}
