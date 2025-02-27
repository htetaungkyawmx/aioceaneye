package org.mdt.aioceaneye.service.impl;

import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.pilot.PilotDetailInfo;
import org.mdt.aioceaneye.dto.pilot.PilotInfo;
import org.mdt.aioceaneye.dto.pilot.PilotRegisterForm;
import org.mdt.aioceaneye.model.PilotWorking;
import org.mdt.aioceaneye.repository.PilotRepo;
import org.mdt.aioceaneye.repository.PilotWorkingRepo;
import org.mdt.aioceaneye.service.PilotsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PilotsServiceImpl implements PilotsService {

    private final PilotRepo pilotRepo;
    private final PilotWorkingRepo pilotWorkingRepo;

    @Override
    public ResponseEntity<String> registerPilot(PilotRegisterForm form) {
        var pilot = PilotRegisterForm.toEntity(form);
        var working = new PilotWorking();
        pilot.setWorking(working);
        pilotRepo.save(pilot);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pilot: " + pilot.getPilotName() + " created successfully");
    }

    @Override
    public List<PilotInfo> getAllPilotInfos() {
        return pilotRepo.getAllPilotInfos();
    }

    @Override
    public PilotDetailInfo getPilotDetailInfoById(String pilotId) {
        return pilotRepo.getPilotDetailInfoById(pilotId);
    }

}
