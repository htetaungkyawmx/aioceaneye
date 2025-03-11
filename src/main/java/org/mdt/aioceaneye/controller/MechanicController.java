package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.mechanic.MechanicDto;
import org.mdt.aioceaneye.service.MechanicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aioceaneye/mechanics")
public class MechanicController {

    private final MechanicService mechanicService;

    @PostMapping
    public ResponseEntity<String> registerMechanic(@RequestBody MechanicDto form) {
        return mechanicService.registerMechanic(form);
    }

    @GetMapping
    public List<MechanicDto> getAllMechanics() {
        return mechanicService.getAllMechanics();
    }

    @GetMapping("/{mechanicId}")
    public MechanicDto getMechanicById(@PathVariable String mechanicId) {
        return mechanicService.getMechanicDtoBySerialNumber(mechanicId);
    }
}
