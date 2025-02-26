package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.CompanyDTO;
import org.mdt.aioceaneye.dto.mechanic.MechanicDto;
import org.mdt.aioceaneye.model.Company;
import org.mdt.aioceaneye.model.Mechanics;

import java.util.List;
import java.util.Optional;

public interface MechanicsService {

    Mechanics save(MechanicDto mechanicDto);

    Optional<Mechanics> update(long mechanicId, MechanicDto mechanicDto);

    List<Mechanics> findAll();

    Optional<Mechanics> findById(long mechanicId);

    void delete(long mechanicId);
}

