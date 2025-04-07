package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.PreFlightLogDto;
import org.mdt.aioceaneye.model.PreFlightLog;
import org.mdt.aioceaneye.repository.PreFlightLogRepo;
import org.mdt.aioceaneye.service.PreFlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreFlightLogServiceImpl implements PreFlightLogService {

    @Autowired
    private PreFlightLogRepo repo;

    @Override
    public PreFlightLog save(PreFlightLogDto dto) {
        return repo.save(PreFlightLog.builder()
                .flightlogId(dto.getFlightlogId())
                .flightAt(dto.getFlightAt())
                .droneId(dto.getDroneId())
                .flightCount(dto.getFlightCount())
                .sailCount(dto.getSailCount())
                .shipId(dto.getShipId())
                .flightstepType(dto.getFlightstepType())
                .workedCode(dto.getWorkedCode())
                .checklistResponse(dto.getChecklistResponse())
                .catchArea(dto.getCatchArea())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<PreFlightLog> update(String id, PreFlightLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setFlightAt(dto.getFlightAt());
            existing.setDroneId(dto.getDroneId());
            existing.setFlightCount(dto.getFlightCount());
            existing.setSailCount(dto.getSailCount());
            existing.setShipId(dto.getShipId());
            existing.setFlightstepType(dto.getFlightstepType());
            existing.setWorkedCode(dto.getWorkedCode());
            existing.setChecklistResponse(dto.getChecklistResponse());
            existing.setCatchArea(dto.getCatchArea());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<PreFlightLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<PreFlightLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
