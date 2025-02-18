package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Ships;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipsRepo extends JpaRepository<Ships,Long> {
}
