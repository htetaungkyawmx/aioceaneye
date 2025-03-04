package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepo extends JpaRepository<Ship,Integer> {

    @Query("""
    select new org.mdt.aioceaneye.dto.ship.ShipInfo(s.shipId, s.shipLogo, s.shipName, s.shipCountry, s.shipImono, s.shipMmsi, s.shipCallSign, s.yield) 
    from Ship s
""")
    List<ShipInfo> findAllShipInfos();

    @Query("""
    select new org.mdt.aioceaneye.dto.ship.ShipInfo(s.shipId, s.shipLogo, s.shipName, s.shipCountry, s.shipImono, s.shipMmsi, s.shipCallSign, s.yield) 
    from Ship s where s.company.coId = :companyId
""")
    List<ShipInfo> findShipInfosByCompanyId(int companyId);
}
