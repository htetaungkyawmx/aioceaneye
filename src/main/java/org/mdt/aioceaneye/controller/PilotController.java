package org.mdt.aioceaneye.controller;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.pilot.PilotDetailInfo;
import org.mdt.aioceaneye.dto.pilot.PilotInfo;
import org.mdt.aioceaneye.dto.pilot.PilotRegisterForm;
import org.mdt.aioceaneye.service.PilotsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aioceaneye/pilot")
public class PilotController {

    private final PilotsService pilotsService;

    @PostMapping
    public ResponseEntity<String> registerPilot(@RequestBody PilotRegisterForm form) {
        return pilotsService.registerPilot(form);
    }

    @GetMapping
    public List<PilotInfo> getAllPilotInfos() {
        return pilotsService.getAllPilotInfos();
    }

    @GetMapping("/{pilotId}")
    public PilotDetailInfo getPilotDetailInfoById(@PathVariable String pilotId) {
        return pilotsService.getPilotDetailInfoById(pilotId);
    }
}
