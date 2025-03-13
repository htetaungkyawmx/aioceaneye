package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.*;
import org.mdt.aioceaneye.service.DroneKindService;
import org.mdt.aioceaneye.service.DroneModelService;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aioceaneye/drones")
public class DroneController {

    private final DroneService droneService;
    private final DroneModelService droneModelService;
    private final DroneKindService droneKindService;

    @PostMapping("/kinds")
    public ResponseEntity<String> createDroneKind(@RequestBody DroneKindCreateForm form) {
        return droneKindService.createDroneKind(form);
    }

    @GetMapping("/kinds")
    public List<DroneKindDto> getAllDroneKinds() {
        return droneKindService.getAllDroneKinds();
    }

    @PostMapping
    ResponseEntity<String> registerDrone(@RequestBody DroneRegisterForm form) {
        return droneService.registerDrone(form);
    }

    @GetMapping
    List<DroneInfo> getAllDrones() {
        return droneService.getAllDroneInfos();
    }

    @GetMapping("/{droneId}")
    DroneDetailsInfo getDroneDetailsInfoById(@PathVariable("droneId") long droneId) {
        return droneService.getDroneById(droneId);
    }


    @PostMapping("/models")
    ResponseEntity<String> createModel(@RequestBody DroneModelCreateForm form) {
        return droneModelService.createDroneModel(form);
    }

    @GetMapping("/models/{modelId}")
    DroneModelInfoDto getDroneModelInfoByModelNo(@PathVariable int modelId) {
        return droneModelService.getDroneModelInfoById(modelId);
    }


}
