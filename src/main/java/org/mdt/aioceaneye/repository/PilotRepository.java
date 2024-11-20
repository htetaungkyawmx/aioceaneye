package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Integer> {
    Pilot findByEmail(String email);
}
