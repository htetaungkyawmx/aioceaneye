package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.MechanicDto;
import org.mdt.aioceaneye.model.Mechanic;

import java.util.List;
import java.util.Optional;

public interface MechanicService {
    Mechanic save(MechanicDto dto);
    Optional<Mechanic> update(String id, MechanicDto dto);
    List<Mechanic> findAll();
    Optional<Mechanic> findById(String id);
    void delete(String id);
}
