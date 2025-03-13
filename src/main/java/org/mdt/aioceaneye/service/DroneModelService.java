package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneModelCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoDto;
import org.springframework.http.ResponseEntity;

public interface DroneModelService {

    ResponseEntity<String> createDroneModel(DroneModelCreateForm form);

    DroneModelInfoDto getDroneModelInfoById(int modelId);
}
