package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.mechanic.MechanicDto;
import org.mdt.aioceaneye.model.Mechanics;
import org.mdt.aioceaneye.service.MechanicsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanicsServiceImpl implements MechanicsService {
    @Override
    public Mechanics save(MechanicDto mechanicDto) {
        return null;
    }

    @Override
    public Optional<Mechanics> update(long mechanicId, MechanicDto mechanicDto) {
        return Optional.empty();
    }

    @Override
    public List<Mechanics> findAll() {
        return List.of();
    }

    @Override
    public Optional<Mechanics> findById(long mechanicId) {
        return Optional.empty();
    }

    @Override
    public void delete(long mechanicId) {

    }
}
