package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoDto;
import org.mdt.aioceaneye.model.DroneModelInfo;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.repository.DroneModelInfoRepo;
import org.mdt.aioceaneye.service.DroneModelInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneModelInfoServiceImpl implements DroneModelInfoService {

    private final DroneModelInfoRepo droneModelInfoRepo;
    private final DroneKindRepo droneKindRepo;

    @Override
    public ResponseEntity<String> createDroneModelInfo(DroneModelInfoCreateForm form) {
        var modelInfo = DroneModelInfoCreateForm.toEntity(form);
        var kind = droneKindRepo.findById(form.kindId()).get();
        modelInfo.setDroneKind(kind);
        droneModelInfoRepo.save(modelInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body("Drone Model: " + modelInfo.getModelNo() + " created successfully");
    }

    @Override
    public ResponseEntity<String> updateDroneModelInfo(DroneModelInfoDto form) {
        if(!droneModelInfoRepo.existsById(form.modelNo())) {
            return ResponseEntity.badRequest().body("Model with no: " + form.modelNo() + " does not exist");
        }
        var modelInfo = droneModelInfoRepo.findById(form.modelNo()).get();
        modelInfo.setModelNo(form.modelNo());
        modelInfo.setManufacturer(form.manufacturer());
        modelInfo.setSize(form.size());
        modelInfo.setWeight(form.weight());
        modelInfo.setMaxRadius(form.maxRadius());
        modelInfo.setMaxSpeed(form.maxSpeed());
        modelInfo.setFlightTime(form.flightTime());
        modelInfo.setMaxAltitude(form.maxAltitude());
        droneModelInfoRepo.save(modelInfo);
        return ResponseEntity.status(HttpStatus.OK).body("Drone Model: " + modelInfo.getModelNo() + " updated successfully");
    }

    @Override
    public DroneModelInfoDto getDroneModelInfoByModelNo(String modelNo) {
        return DroneModelInfoDto.toDto(droneModelInfoRepo.findById(modelNo).get());
    }
}
