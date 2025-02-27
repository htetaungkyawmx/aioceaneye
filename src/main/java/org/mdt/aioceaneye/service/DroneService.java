package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneDto;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DroneService {

    ResponseEntity<String> registerDrone(DroneRegisterForm form);

    List<DroneDto> getAllDrones();

    DroneDto getDroneById(long id);
}
