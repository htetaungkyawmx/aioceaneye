package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.PilotDto;
import org.mdt.aioceaneye.model.Pilot;

import java.util.List;
import java.util.Optional;

public interface PilotService {
    Pilot save(PilotDto pilotDto);
    List<Pilot> findAll();
    Optional<Pilot> findById(int id);
    Pilot findByEmail(String email);
    boolean validateUser(String email, String password);
}
