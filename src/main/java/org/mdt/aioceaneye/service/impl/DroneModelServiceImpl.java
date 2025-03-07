package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneModelCreateForm;
import org.mdt.aioceaneye.dto.drone.DroneModelInfoDto;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.repository.DroneModelRepo;
import org.mdt.aioceaneye.service.DroneModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneModelServiceImpl implements DroneModelService {

    private final DroneModelRepo droneModelRepo;
    private final DroneKindRepo droneKindRepo;

    @Override
    public ResponseEntity<String> createDroneModel(DroneModelCreateForm form) {
        var model = DroneModelCreateForm.toEntity(form);
        var kind = droneKindRepo.findById(form.kindId()).get();
        model.setDroneKind(kind);
        droneModelRepo.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body("Drone Model: " + model.getModel() + " created successfully");
    }

    @Override
    public DroneModelInfoDto getDroneModelInfoById(int modelId) {
        return droneModelRepo.findById(modelId).map(DroneModelInfoDto::toDto).orElse(null);
    }


}
