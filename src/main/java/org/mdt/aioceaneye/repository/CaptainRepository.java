package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Captain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptainRepository extends JpaRepository<Captain, Integer> {
    Captain findByEmail(String email);
}
