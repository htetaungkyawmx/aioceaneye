package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.PilotSLogDto;
import org.mdt.aioceaneye.model.PilotSLog;
import org.mdt.aioceaneye.repository.PilotSLogRepo;
import org.mdt.aioceaneye.service.PilotSLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotSLogServiceImpl implements PilotSLogService {

    @Autowired
    private PilotSLogRepo repo;

    @Override
    public PilotSLog save(PilotSLogDto dto) {
        return repo.save(PilotSLog.builder()
                .pilotId(dto.getPilotId())
                .groundDays(dto.getGroundDays())
                .groundDaysLeft(dto.getGroundDaysLeft())
                .boardDays(dto.getBoardDays())
                .boardDaysLeft(dto.getBoardDaysLeft())
                .vacationDays(dto.getVacationDays())
                .vacationDaysLeft(dto.getVacationDaysLeft())
                .updateAt(dto.getUpdateAt())
                .build());
    }

    @Override
    public Optional<PilotSLog> update(String id, PilotSLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setGroundDays(dto.getGroundDays());
            existing.setGroundDaysLeft(dto.getGroundDaysLeft());
            existing.setBoardDays(dto.getBoardDays());
            existing.setBoardDaysLeft(dto.getBoardDaysLeft());
            existing.setVacationDays(dto.getVacationDays());
            existing.setVacationDaysLeft(dto.getVacationDaysLeft());
            existing.setUpdateAt(dto.getUpdateAt());
            return repo.save(existing);
        });
    }

    @Override
    public List<PilotSLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<PilotSLog> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
