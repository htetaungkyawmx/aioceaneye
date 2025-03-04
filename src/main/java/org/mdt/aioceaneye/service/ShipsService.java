package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShipsService {

    ResponseEntity<String> registerShip(ShipRegisterForm form);

    List<ShipInfo> getAllShipInfos();

    List<ShipInfo> getShipInfosByCompanyId(int companyId);

    ResponseEntity<String> deleteShip(int shipId);

    ResponseEntity<String> updateShip(ShipRegisterForm form, int shipId);

    ResponseEntity<String> setCompany(int coId, int shipId);


}
