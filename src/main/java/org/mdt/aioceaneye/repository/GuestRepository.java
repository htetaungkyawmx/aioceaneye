package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}
