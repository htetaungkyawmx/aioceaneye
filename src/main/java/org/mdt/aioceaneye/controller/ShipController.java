package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mdt/vessel")
public class ShipController {

    private final ShipsService shipsService;

    @PostMapping
    public ResponseEntity<String> registerShip(@RequestBody ShipRegisterForm form) {
        return shipsService.registerShip(form);
    }

    @GetMapping
    public List<ShipInfo> getAllShipInfos() {
        return shipsService.getAllShipInfos();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateShip(@RequestBody ShipRegisterForm form, @PathVariable Long shipId) {
        return shipsService.updateShip(form, shipId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShip(@PathVariable Long shipId) {
        return shipsService.deleteShip(shipId);
    }

}

