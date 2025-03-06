package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneKindCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneKindDto;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mdt/drone_kinds")
public class DroneKindController {

    private final DroneKindService droneKindService;

    @PostMapping
    public ResponseEntity<String> createDroneKind(@RequestBody DroneKindCreateForm form) {
        return droneKindService.createDroneKind(form);
    }

    @GetMapping
    public List<DroneKindDto> getAllDroneKinds() {
        return droneKindService.getAllDroneKinds();
    }
}
