package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DetailFlightLogDto;
import org.mdt.aioceaneye.model.DetailFlightLog;
import org.mdt.aioceaneye.repository.DetailFlightLogRepo;
import org.mdt.aioceaneye.service.DetailFlightLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailFlightLogServiceImpl implements DetailFlightLogService {

    @Autowired
    private DetailFlightLogRepo repo;

    @Override
    public DetailFlightLog save(DetailFlightLogDto dto) {
        return repo.save(DetailFlightLog.builder()
                .flightlogId(dto.getFlightlogId())
                .pilotNo(dto.getPilotNo())
                .mechanicNo(dto.getMechanicNo())
                .coId(dto.getCoId())
                .gcsId(dto.getGcsId())
                .datalinkId(dto.getDatalinkId())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<DetailFlightLog> update(String id, DetailFlightLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setPilotNo(dto.getPilotNo());
            existing.setMechanicNo(dto.getMechanicNo());
            existing.setCoId(dto.getCoId());
            existing.setGcsId(dto.getGcsId());
            existing.setDatalinkId(dto.getDatalinkId());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<DetailFlightLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<DetailFlightLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
