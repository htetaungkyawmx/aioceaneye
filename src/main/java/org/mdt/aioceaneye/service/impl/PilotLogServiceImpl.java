package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.PilotLogDto;
import org.mdt.aioceaneye.model.PilotLog;
import org.mdt.aioceaneye.repository.PilotLogRepo;
import org.mdt.aioceaneye.service.PilotLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotLogServiceImpl implements PilotLogService {

    @Autowired
    private PilotLogRepo repo;

    @Override
    public PilotLog save(PilotLogDto dto) {
        return repo.save(PilotLog.builder()
                .pilotId(dto.getPilotId())
                .flightAt(dto.getFlightAt())
                .shipId(dto.getShipId())
                .flightCount(dto.getFlightCount())
                .flightTime(dto.getFlightTime())
                .flightDistance(dto.getFlightDistance())
                .flightFamount(dto.getFlightFamount())
                .flightType(dto.getFlightType())
                .flightTcount(dto.getFlightTcount())
                .flightTtime(dto.getFlightTtime())
                .flightTdistance(dto.getFlightTdistance())
                .flightTday(dto.getFlightTday())
                .flightTfamount(dto.getFlightTfamount())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<PilotLog> update(String id, PilotLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setFlightAt(dto.getFlightAt());
            existing.setShipId(dto.getShipId());
            existing.setFlightCount(dto.getFlightCount());
            existing.setFlightTime(dto.getFlightTime());
            existing.setFlightDistance(dto.getFlightDistance());
            existing.setFlightFamount(dto.getFlightFamount());
            existing.setFlightType(dto.getFlightType());
            existing.setFlightTcount(dto.getFlightTcount());
            existing.setFlightTtime(dto.getFlightTtime());
            existing.setFlightTdistance(dto.getFlightTdistance());
            existing.setFlightTday(dto.getFlightTday());
            existing.setFlightTfamount(dto.getFlightTfamount());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<PilotLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<PilotLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
