package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.FlightLogDto;
import org.mdt.aioceaneye.model.FlightLog;
import org.mdt.aioceaneye.repository.FlightLogRepo;
import org.mdt.aioceaneye.service.FlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightLogServiceImpl implements FlightLogService {

    @Autowired
    private FlightLogRepo repo;

    @Override
    public FlightLog save(FlightLogDto dto) {
        return repo.save(FlightLog.builder()
                .flightlogId(dto.getFlightlogId())
                .flightAt(dto.getFlightAt())
                .droneId(dto.getDroneId())
                .flightCount(dto.getFlightCount())
                .sailCount(dto.getSailCount())
                .flightstepType(dto.getFlightstepType())
                .workedCode(dto.getWorkedCode())
                .checklistResponse(dto.getChecklistResponse())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<FlightLog> update(String id, FlightLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setFlightAt(dto.getFlightAt());
            existing.setDroneId(dto.getDroneId());
            existing.setFlightCount(dto.getFlightCount());
            existing.setSailCount(dto.getSailCount());
            existing.setFlightstepType(dto.getFlightstepType());
            existing.setWorkedCode(dto.getWorkedCode());
            existing.setChecklistResponse(dto.getChecklistResponse());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<FlightLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<FlightLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
