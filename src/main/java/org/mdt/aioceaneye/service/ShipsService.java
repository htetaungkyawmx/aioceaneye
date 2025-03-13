package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ship.ShipDetailsInfo;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegistrationForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShipsService {

    ResponseEntity<String> registerShip(ShipRegistrationForm form);

    List<ShipInfo> getAllShipInfos();

    ShipDetailsInfo getShipDetailsById(int shipId);

    List<ShipInfo> getShipInfosByCompanyId(int companyId);

    ResponseEntity<String> deleteShip(int shipId);

    ResponseEntity<String> updateShip(ShipRegistrationForm form, int shipId);

    ResponseEntity<String> setCompany(int coId, int shipId);


}
