package org.mdt.aioceaneye.service.impl;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.mdt.aioceaneye.model.Ship;
import org.mdt.aioceaneye.repository.ShipRepo;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipsServiceImpl implements ShipsService {

    private final ShipRepo shipRepo;

    @Override
    public ResponseEntity<String> registerShip(ShipRegisterForm form) {
        Ship ship = shipRepo.save(ShipRegisterForm.toEntity(form));
        return ResponseEntity.status(HttpStatus.CREATED).body("Ship: " + ship.getShipName() + " registered successfully");
    }

    @Override
    public List<ShipInfo> getAllShipInfos() {
        return shipRepo.findAllShipInfos();
    }
}
