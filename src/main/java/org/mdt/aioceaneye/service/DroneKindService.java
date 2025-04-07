package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DroneKindDto;
import org.mdt.aioceaneye.model.DroneKind;

import java.util.List;
import java.util.Optional;

public interface DroneKindService {
    DroneKind save(DroneKindDto dto);
    Optional<DroneKind> update(int id, DroneKindDto dto);
    List<DroneKind> findAll();
    Optional<DroneKind> findById(int id);
    void delete(int id);
}

