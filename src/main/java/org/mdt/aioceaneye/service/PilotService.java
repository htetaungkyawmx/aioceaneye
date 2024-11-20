package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotDto;
import org.mdt.aioceaneye.model.Pilot;

import java.util.List;

public interface PilotService {
    Pilot save(PilotDto pilotDto);
    List<Pilot> findAll();

}
