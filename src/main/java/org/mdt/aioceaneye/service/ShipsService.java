package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ShipsDto;
import org.mdt.aioceaneye.model.Ships;

import java.util.List;
import java.util.Optional;

public interface ShipsService {
    Ships save(ShipsDto shipsDto);

    Optional<Ships> update(int id, ShipsDto shipsDto);

    List<Ships> findAll();

    Optional<Ships> findById(int id);

    void delete(int id);
}
