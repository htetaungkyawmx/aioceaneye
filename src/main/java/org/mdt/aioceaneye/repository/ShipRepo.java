package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepo extends JpaRepository<Ship,Long> {

    @Query("""
    select s.shipId, s.shipLogo, s.shipName, s.shipCountry, s.shipImono, s.shipMmsi, s.shipCallSign from Ship s
""")
    List<ShipInfo> findAllShipInfos();
}
