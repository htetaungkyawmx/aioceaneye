package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.ship.ShipRegisterForm;
import org.mdt.aioceaneye.service.ShipsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aioceaneye/vessels/")
public class ShipController {

    private final ShipsService shipsService;

    @PostMapping("/register")
    public ResponseEntity<String> registerShip(ShipRegisterForm form) {
        return shipsService.registerShip(form);
    }

}
