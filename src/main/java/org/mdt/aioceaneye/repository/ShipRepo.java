package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.ship.ShipDetailsInfo;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
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


    @Query("""
    select new org.mdt.aioceaneye.dto.ship.ShipDetailsInfo(s.shipName, s.shipCallSign, s.company.coName, s.shipCountry, s.shipOfficeNo, s.shipImono,
    s.shipAddress, s.shipMmsi, s.shipPhone, s.shipEmail, s.yield, s.buildYear, s.shipLogo, s.shipCaptainName, s.ship1thName, s.ship2thName, s.ship3thName,
    s.shipCaptainEmail, s.ship1thEmail, s.ship2thEmail, s.ship3thEmail) from Ship s where s.shipId = :shipId
""")
    ShipDetailsInfo findShipDetailsInfoByShipId(@Param("shipId") int shipId);
}
