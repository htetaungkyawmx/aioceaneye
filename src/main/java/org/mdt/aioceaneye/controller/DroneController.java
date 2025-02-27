package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneDto;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoDto;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.service.DroneModelInfoService;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mdt/drones")
public class DroneController {

    private final DroneService droneService;
    private final DroneModelInfoService droneModelInfoService;

    @PostMapping
    ResponseEntity<String> registerDrone(@RequestBody DroneRegisterForm form) {
        return droneService.registerDrone(form);
    }

    @GetMapping
    List<DroneDto> getAllDrones() {
        return droneService.getAllDrones();
    }

    @GetMapping("/{droneId}")
    DroneDto getDroneById(@PathVariable("droneId") long droneId) {
        return droneService.getDroneById(droneId);
    }


    @PostMapping("/models")
    ResponseEntity<String> createModel(@RequestBody DroneModelInfoCreateForm form) {
        return droneModelInfoService.createDroneModelInfo(form);
    }

    @GetMapping("/models/{modelNo}")
    DroneModelInfoDto getDroneModelInfoByModelNo(@PathVariable String modelNo) {
        return droneModelInfoService.getDroneModelInfoByModelNo(modelNo);
    }

    @PutMapping("/models")
    ResponseEntity<String> updateModel(@RequestBody DroneModelInfoDto form) {
        return droneModelInfoService.updateDroneModelInfo(form);
    }

}
