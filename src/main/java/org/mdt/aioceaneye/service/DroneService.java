package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DroneService {

    ResponseEntity<String> registerDrone(DroneRegisterForm form);

    List<DroneInfo> getAllDrones();

    DroneInfo getDroneById(long id);
}
