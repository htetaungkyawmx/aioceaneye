package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DroneService {

    ResponseEntity<String> registerDrone(DroneRegisterForm form);

    DroneInfo getDroneById(long id);

    List<DroneInfo> getAllDroneInfos();

    ResponseEntity<String> equipMaterial(long droneId, String serialNo);
//    ResponseEntity<String> unequipMaterial(String serialNo);
}
