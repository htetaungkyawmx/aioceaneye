package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.model.DroneLoadout;
import org.mdt.aioceaneye.repository.DroneModelRepo;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.service.DroneService;
import org.mdt.aioceaneye.service.MaterialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneServiceImpl implements DroneService {

    private final DroneRepo droneRepo;
    private final DroneModelRepo droneModelRepo;
    private final MaterialService materialService;

     /*when drone was registered, it's loadout was created.
     Then inside createMaterialLog() function, the log for using that material
     for specific drone was recorded.*/
    @Override
    public ResponseEntity<String> registerDrone(DroneRegisterForm form) {
        var drone = DroneRegisterForm.toEntity(form);
        var model = droneModelRepo.findById(form.modelName()).get();
        drone.setDroneModel(model);
        drone.setDroneLoadout(new DroneLoadout());
        droneRepo.save(drone);
        materialService.createMaterialLog(drone, form.fcSN());
        return ResponseEntity.status(HttpStatus.CREATED).body("Drone: " + drone.getSerial_no() + "  registered successfully");
    }

    @Override
    public List<DroneInfo> getAllDrones() {
        return List.of();
    }

    @Override
    public DroneInfo getDroneById(long id) {
        return null;
    }
}
