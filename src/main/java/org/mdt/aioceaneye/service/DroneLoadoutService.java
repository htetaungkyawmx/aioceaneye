package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DroneLoadoutDto;
import org.mdt.aioceaneye.dto.DroneLoadoutKey;
import org.mdt.aioceaneye.model.DroneLoadout;

import java.util.List;
import java.util.Optional;

public interface DroneLoadoutService {
    DroneLoadout save(DroneLoadoutDto dto);
    Optional<DroneLoadout> update(DroneLoadoutKey id, DroneLoadoutDto dto);
    List<DroneLoadout> findAll();
    Optional<DroneLoadout> findById(DroneLoadoutKey id);
    void delete(DroneLoadoutKey id);
}
