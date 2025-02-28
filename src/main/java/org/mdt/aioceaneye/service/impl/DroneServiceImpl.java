package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneDto;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.repository.DroneModelRepo;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneServiceImpl implements DroneService {

    private final DroneRepo droneRepo;
    private final DroneModelRepo droneModelRepo;

    @Override
    public ResponseEntity<String> registerDrone(DroneRegisterForm form) {
        var drone = DroneRegisterForm.toEntity(form);
        var model = droneModelRepo.findById(form.modelName()).get();
        drone.setDroneModel(model);
        droneRepo.save(drone);
        return null;
    }

    @Override
    public List<DroneDto> getAllDrones() {
        return List.of();
    }

    @Override
    public DroneDto getDroneById(long id) {
        return null;
    }
}
