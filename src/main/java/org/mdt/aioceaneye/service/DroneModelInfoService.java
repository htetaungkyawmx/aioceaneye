package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneModelInfoCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoDto;
import org.springframework.http.ResponseEntity;

public interface DroneModelInfoService {

    ResponseEntity<String> createDroneModelInfo(DroneModelInfoCreateForm form);

    ResponseEntity<String> updateDroneModelInfo(DroneModelInfoDto form);

    DroneModelInfoDto getDroneModelInfoByModelNo(String modelNo);
}
