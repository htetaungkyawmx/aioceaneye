package org.mdt.aioceaneye.service.impl;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.pilot.PilotDetailInfo;
import org.mdt.aioceaneye.dto.pilot.PilotInfo;
import org.mdt.aioceaneye.dto.pilot.PilotRegisterForm;
import org.mdt.aioceaneye.repository.PilotRepo;
import org.mdt.aioceaneye.service.PilotsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PilotsServiceImpl implements PilotsService {

    private final PilotRepo pilotRepo;

    @Override
    public ResponseEntity<String> registerPilot(PilotRegisterForm form) {
        var pilot = pilotRepo.save(PilotRegisterForm.toEntity(form));
        return ResponseEntity.status(HttpStatus.CREATED).body("Pilot: " + pilot.getPilotName() + " created successfully");
    }

    @Override
    public List<PilotInfo> getAllPilotInfos() {
        return List.of();
    }

    @Override
    public PilotDetailInfo getPilotDetailInfoById(String pilotId) {
        return null;
    }
}
