package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.drone.DroneKindCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneKindDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DroneKindService {

    ResponseEntity<String> createDroneKind(DroneKindCreateForm form);

    List<DroneKindDto> getAllDroneKinds();

}
