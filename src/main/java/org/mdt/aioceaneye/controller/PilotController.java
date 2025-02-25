package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.pilot.PilotRegisterForm;
import org.mdt.aioceaneye.service.PilotsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mdt/pilot")
public class PilotController {

    private final PilotsService pilotsService;

    @PostMapping
    public ResponseEntity<String> registerPilot(@RequestBody PilotRegisterForm form) {
        return pilotsService.registerPilot(form);
    }
}
