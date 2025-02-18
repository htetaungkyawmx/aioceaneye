package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Ships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipsRepo extends JpaRepository<Ships,Long> {
}
