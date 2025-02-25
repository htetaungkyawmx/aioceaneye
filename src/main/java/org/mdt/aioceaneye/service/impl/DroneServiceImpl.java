package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DroneDTO;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneServiceImpl implements DroneService {

    @Autowired
    private DroneRepo droneRepo;

    @Override
    public Drone save(DroneDTO droneDTO) {
        Drone drone = Drone.builder()
                .serial_no(droneDTO.getSerial_no())
                .version_no(droneDTO.getVersion_no())
                .modelName(droneDTO.getModelName())
                .size(droneDTO.getSize())
                .max_altitude(droneDTO.getMax_altitude())
                .max_speed(droneDTO.getMax_speed())
                .max_radius(droneDTO.getMax_radius())
                .flight_time(droneDTO.getFlight_time())
                .max_endurance(droneDTO.getMax_endurance())
                .drone_img(droneDTO.getDrone_img())
                .build();
        return droneRepo.save(drone);
    }

    @Override
    public Optional<Drone> update(long droneId, DroneDTO droneDTO) {
        return droneRepo.findById(droneId).map(existingDrone -> {
            existingDrone.setSerial_no(droneDTO.getSerial_no());
            existingDrone.setVersion_no(droneDTO.getVersion_no());
            existingDrone.setModelName(droneDTO.getModelName());
            existingDrone.setSize(droneDTO.getSize());
            existingDrone.setMax_altitude(droneDTO.getMax_altitude());
            existingDrone.setMax_speed(droneDTO.getMax_speed());
            existingDrone.setMax_radius(droneDTO.getMax_radius());
            existingDrone.setFlight_time(droneDTO.getFlight_time());
            existingDrone.setMax_endurance(droneDTO.getMax_endurance());
            existingDrone.setDrone_img(droneDTO.getDrone_img());
            return droneRepo.save(existingDrone);
        });
    }

    @Override
    public List<Drone> findAll() {
        return droneRepo.findAll();
    }

    @Override
    public Optional<Drone> findById(long droneId) {
        return droneRepo.findById(droneId);
    }

    @Override
    public void delete(long droneId) {
        if (droneRepo.existsById(droneId)) {
            droneRepo.deleteById(droneId);
        }
    }
}
