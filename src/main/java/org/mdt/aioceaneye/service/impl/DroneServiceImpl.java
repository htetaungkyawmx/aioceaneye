package org.mdt.aioceaneye.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mdt.aioceaneye.dto.drone.DroneDto;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.model.DroneEquippedMaterials;
import org.mdt.aioceaneye.model.DroneModelInfo;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.repository.DroneModelInfoRepo;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.repository.MaterialRepo;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class DroneServiceImpl implements DroneService {

    private final DroneRepo droneRepo;
    private final DroneModelInfoRepo modelRepo;
    private final MaterialRepo materialRepo;

    @Override
    public ResponseEntity<String> registerDrone(DroneRegisterForm form) {
        var drone = DroneRegisterForm.toEntity(form);
        var model = modelRepo.findById(form.modelName()).get();
        drone.setModelInfo(model);

        var droneEquippedMaterials = new DroneEquippedMaterials();
        droneEquippedMaterials.setDroneId(drone.getDroneId());

        var fc = materialRepo.findById(form.fcSN()).get();
        var gps = materialRepo.findById(form.gpsSN()).get();
        var camera = materialRepo.findById(form.cameraSN()).get();
        var rc = materialRepo.findById(form.rcSN()).get();
        var converter = materialRepo.findById(form.converterSN()).get();
        var pb = materialRepo.findById(form.pbSN()).get();
        var ubc = materialRepo.findById(form.ubcSN()).get();
        var airSpeed = materialRepo.findById(form.airSpeedSN()).get();
        var dataLinkAir = materialRepo.findById(form.dataLinkAirSN()).get();
        var dataLinkGround = materialRepo.findById(form.dataLinkGroundSN()).get();
        var servoLA =  materialRepo.findById(form.servoLASN()).get();
        var servoRA =  materialRepo.findById(form.servoRASN()).get();
        var servoE = materialRepo.findById(form.servoESN()).get();
        var motor1  = materialRepo.findById(form.motor1SN()).get();
        var motor2  = materialRepo.findById(form.motor2SN()).get();
        var motor3  = materialRepo.findById(form.motor3SN()).get();
        var motor4  = materialRepo.findById(form.motor4SN()).get();
        var prop1  = materialRepo.findById(form.prop1SN()).get();
        var prop2  = materialRepo.findById(form.prop2SN()).get();
        var prop3  = materialRepo.findById(form.prop3SN()).get();
        var prop4  = materialRepo.findById(form.prop4SN()).get();
        var fixEsc = materialRepo.findById(form.fixEscSN()).get();
        var fixProp = materialRepo.findById(form.fixPropSN()).get();

        droneEquippedMaterials.setFc(fc);
        droneEquippedMaterials.setGps(gps);
        droneEquippedMaterials.setCamera(camera);
        droneEquippedMaterials.setRc(rc);
        droneEquippedMaterials.setConverter(converter);
        droneEquippedMaterials.setPowerBoard(pb);
        droneEquippedMaterials.setUbc(ubc);
        droneEquippedMaterials.setAirSpeedSensor(airSpeed);
        droneEquippedMaterials.setDataLinkAir(dataLinkAir);
        droneEquippedMaterials.setDataLinkGround(dataLinkGround);
        droneEquippedMaterials.setServorLeftAileron(servoLA);
        droneEquippedMaterials.setServorRightAileron(servoRA);
        droneEquippedMaterials.setServorElevator(servoE);
        droneEquippedMaterials.setMotor1(motor1);
        droneEquippedMaterials.setMotor2(motor2);
        droneEquippedMaterials.setMotor3(motor3);
        droneEquippedMaterials.setMotor4(motor4);
        droneEquippedMaterials.setProp1(prop1);
        droneEquippedMaterials.setProp2(prop2);
        droneEquippedMaterials.setProp3(prop3);
        droneEquippedMaterials.setProp4(prop4);
        droneEquippedMaterials.setFixesc(fixEsc);
        droneEquippedMaterials.setFixProp(fixProp);


        droneRepo.save(drone);



        return ResponseEntity.status(HttpStatus.CREATED).body("Drone: " + drone.getSerial_no() + " registered successfully");
    }

    @Override
    public List<DroneDto> getAllDrones() {
        return droneRepo.findAll().stream().map(DroneDto::toDto).collect(Collectors.toList());
    }

    @Override
    public DroneDto getDroneById(long id) {
        return droneRepo.findById(id).map(DroneDto::toDto).orElse(null);
    }
}
