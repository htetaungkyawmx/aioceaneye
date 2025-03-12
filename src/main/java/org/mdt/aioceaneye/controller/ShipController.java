package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.ship.ShipDetailsInfo;
import org.mdt.aioceaneye.dto.ship.ShipInfo;
import org.mdt.aioceaneye.dto.ship.ShipRegistrationForm;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aioceaneye/vessels")
public class ShipController {

    private final ShipsService shipsService;

    @PostMapping
    public ResponseEntity<String> registerShip(@RequestBody ShipRegistrationForm form) {
        return shipsService.registerShip(form);
    }

    @GetMapping
    public List<ShipInfo> getAllShipInfos() {
        return shipsService.getAllShipInfos();
    }

    @GetMapping("/{shipId}")
    public ShipDetailsInfo  getShipDetailsById(@PathVariable int shipId) {
        return shipsService.getShipDetailsById(shipId);
    }

    @GetMapping("/company/{coId}")
    public List<ShipInfo> getShipInfosByCompanyId(@PathVariable int coId) {
        return shipsService.getShipInfosByCompanyId(coId);
    }

    @PutMapping("/{shipId}")
    public ResponseEntity<String> updateShip(@RequestBody ShipRegistrationForm form, @PathVariable int shipId) {
        return shipsService.updateShip(form, shipId);
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<String> deleteShip(@PathVariable int shipId) {
        return shipsService.deleteShip(shipId);
    }

}

