package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DronesDTO;
import org.mdt.aioceaneye.model.Drones;

import java.util.List;
import java.util.Optional;

public interface DronesService {
    Drones save(DronesDTO droneDto);

    Optional<Drones> update(int id, DronesDTO droneDto);

    List<Drones> findAll();

    Optional<Drones> findById(int id);

    void delete(int id);
}
