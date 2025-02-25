package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShipsService {

    ResponseEntity<String> registerShip(ShipRegisterForm form);

    List<ShipInfo> getAllShipInfos();

    ResponseEntity<String> deleteShip(long shipId);

    ResponseEntity<String> updateShip(ShipRegisterForm form, long shipId);

    ResponseEntity<String> setCompany(long coId, long shipId);
}
