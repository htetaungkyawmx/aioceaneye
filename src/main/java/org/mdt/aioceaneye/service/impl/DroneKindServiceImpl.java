package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneKindCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneKindDto;
import org.mdt.aioceaneye.model.DroneKind;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneKindServiceImpl implements DroneKindService {

    private final DroneKindRepo droneKindRepo;

    @Override
    public ResponseEntity<String> createDroneKind(DroneKindCreateForm form) {
        DroneKind droneKind = DroneKindCreateForm.toEntity(form);
        droneKindRepo.save(droneKind);
        return ResponseEntity.status(HttpStatus.CREATED).body("Drone Kind : " + droneKind.getKind() + " registered successfully");
    }

    @Override
    public List<DroneKindDto> getAllDroneKinds() {
        return droneKindRepo.findAll().stream().map(DroneKindDto::toDto).collect(Collectors.toList());
    }
}

