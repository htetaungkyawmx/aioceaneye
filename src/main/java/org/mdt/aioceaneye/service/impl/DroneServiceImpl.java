package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneDetailsInfo;
import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.model.Material;
import org.mdt.aioceaneye.repository.DroneModelRepo;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.repository.MaterialRepo;
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
    private final MaterialRepo materialRepo;
    private final MaterialService materialService;

    // At the time of drone register, it will be equipped with the materials coming from the form with the list of serial numbers.
    @Override
    public ResponseEntity<String> registerDrone(DroneRegisterForm form) {
        var drone = DroneRegisterForm.toEntity(form);
        var ls = form.modelName().split("-");

        if(!droneModelRepo.existsByModel(ls[0], ls[1])) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Model " + form.modelName() + " not found");
        }

        var model = droneModelRepo.findByModel(ls[0], ls[1]).get();
        drone.setDroneModel(model);

        form.materialSerialNos().forEach(sn -> equipMaterial(drone, sn));

        droneRepo.save(drone);
        return ResponseEntity.status(HttpStatus.CREATED).body("Drone: " + drone.getSerial_no() + "  registered successfully");
    }

    @Override
    public DroneDetailsInfo getDroneById(long id) {
        return droneRepo.getDroneDetailsInfoByDroneId(id);
    }

    @Override
    public List<DroneInfo> getAllDroneInfos() {
        return droneRepo.getAllDroneInfos();
    }

    // when material is equipped to drone, it's materialLog table will be created
    @Override
    public ResponseEntity<String> equipMaterial(Drone drone, String materialSerialNo) {
        if(materialSerialNo == null || !materialRepo.existsById(materialSerialNo)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid serial no");
        }
        materialRepo.findById(materialSerialNo).ifPresent(material -> {
            drone.equipMaterial(material);
            material.setUseStatus(true);
            materialService.createMaterialLog(drone.getSerial_no(), materialSerialNo);
        });

        return ResponseEntity.status(HttpStatus.OK).body("Material: " + materialSerialNo + " equipped successfully");
    }

    @Override
    public ResponseEntity<String> unequipMaterial(String serialNo) {
        return null;
    }
}
