package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.pilot.PilotDetailInfo;
import org.mdt.aioceaneye.dto.pilot.PilotInfo;
import org.mdt.aioceaneye.dto.pilot.PilotRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PilotsService {

    ResponseEntity<String> registerPilot(PilotRegisterForm form);

    List<PilotInfo> getAllPilotInfos();

    PilotDetailInfo getPilotDetailInfoById(String pilotId);

}
