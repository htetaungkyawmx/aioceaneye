package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FishInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishInfoRepo extends JpaRepository<FishInfo,Long> {
}
