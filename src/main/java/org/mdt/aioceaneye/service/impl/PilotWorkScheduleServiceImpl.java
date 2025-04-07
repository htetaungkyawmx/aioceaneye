package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.PilotWorkScheduleDto;
import org.mdt.aioceaneye.model.PilotWorkSchedule;
import org.mdt.aioceaneye.repository.PilotWorkScheduleRepo;
import org.mdt.aioceaneye.service.PilotWorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotWorkScheduleServiceImpl implements PilotWorkScheduleService {

    @Autowired
    private PilotWorkScheduleRepo repo;

    @Override
    public PilotWorkSchedule save(PilotWorkScheduleDto dto) {
        return repo.save(PilotWorkSchedule.builder()
                .pilotId(dto.getPilotId())
                .pilotStatus(dto.getPilotStatus())
                .startedAt(dto.getStartedAt())
                .endedAt(dto.getEndedAt())
                .emergencyPhone(dto.getEmergencyPhone())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<PilotWorkSchedule> update(String id, PilotWorkScheduleDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setPilotStatus(dto.getPilotStatus());
            existing.setStartedAt(dto.getStartedAt());
            existing.setEndedAt(dto.getEndedAt());
            existing.setEmergencyPhone(dto.getEmergencyPhone());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<PilotWorkSchedule> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<PilotWorkSchedule> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
