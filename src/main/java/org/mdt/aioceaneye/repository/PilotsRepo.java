package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Pilots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotsRepo extends JpaRepository<Pilots, Long> {
}
