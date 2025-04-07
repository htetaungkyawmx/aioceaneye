package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DroneDto;
import org.mdt.aioceaneye.model.Drone;

import java.util.List;
import java.util.Optional;

public interface DroneService {
    Drone save(DroneDto dto);
    Optional<Drone> update(int id, DroneDto dto);
    List<Drone> findAll();
    Optional<Drone> findById(int id);
    void delete(int id);
}
