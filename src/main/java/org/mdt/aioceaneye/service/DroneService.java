package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DroneDTO;
import org.mdt.aioceaneye.model.Drone;

import java.util.List;
import java.util.Optional;

public interface DroneService {
    Drone save(DroneDTO droneDTO);
    Optional<Drone> update(long droneId, DroneDTO droneDTO);
    List<Drone> findAll();
    Optional<Drone> findById(long droneId);
    void delete(long droneId);
}
