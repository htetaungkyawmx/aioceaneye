package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.InFlightLogDto;
import org.mdt.aioceaneye.model.InFlightLog;
import org.mdt.aioceaneye.repository.InFlightLogRepo;
import org.mdt.aioceaneye.service.InFlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InFlightLogServiceImpl implements InFlightLogService {

    @Autowired
    private InFlightLogRepo repo;

    @Override
    public InFlightLog save(InFlightLogDto dto) {
        return repo.save(InFlightLog.builder()
                .flightlogId(dto.getFlightlogId())
                .flightAt(dto.getFlightAt())
                .droneId(dto.getDroneId())
                .flightCount(dto.getFlightCount())
                .sailCount(dto.getSailCount())
                .shipId(dto.getShipId())
                .flightstepType(dto.getFlightstepType())
                .workedCode(dto.getWorkedCode())
                .checklistResponse(dto.getChecklistResponse())
                .alt(dto.getAlt())
                .lon(dto.getLon())
                .detectedAmount(dto.getDetectedAmount())
                .fishId(dto.getFishId())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<InFlightLog> update(String id, InFlightLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setFlightAt(dto.getFlightAt());
            existing.setDroneId(dto.getDroneId());
            existing.setFlightCount(dto.getFlightCount());
            existing.setSailCount(dto.getSailCount());
            existing.setShipId(dto.getShipId());
            existing.setFlightstepType(dto.getFlightstepType());
            existing.setWorkedCode(dto.getWorkedCode());
            existing.setChecklistResponse(dto.getChecklistResponse());
            existing.setAlt(dto.getAlt());
            existing.setLon(dto.getLon());
            existing.setDetectedAmount(dto.getDetectedAmount());
            existing.setFishId(dto.getFishId());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<InFlightLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<InFlightLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
