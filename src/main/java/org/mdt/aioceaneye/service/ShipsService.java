package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShipsService {

    public ResponseEntity<String> registerShip(ShipRegisterForm form);

    public List<ShipInfo> getAllShipInfos();
}
