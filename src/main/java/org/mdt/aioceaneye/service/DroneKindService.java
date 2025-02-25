package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.DroneKindDTO;
import org.mdt.aioceaneye.model.DroneKind;

import java.util.List;
import java.util.Optional;

public interface DroneKindService {
    DroneKind save(DroneKindDTO droneKindDTO);
    Optional<DroneKind> update(int kind_id, DroneKindDTO droneKindDTO);
    List<DroneKind> findAll();
    Optional<DroneKind> findById(int kind_id);
    void delete(int kind_id);
}
