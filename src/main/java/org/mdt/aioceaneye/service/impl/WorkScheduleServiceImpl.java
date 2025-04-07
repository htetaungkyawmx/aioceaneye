package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.WorkScheduleDto;
import org.mdt.aioceaneye.model.WorkSchedule;
import org.mdt.aioceaneye.repository.WorkScheduleRepo;
import org.mdt.aioceaneye.service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkScheduleServiceImpl implements WorkScheduleService {

    @Autowired
    private WorkScheduleRepo repo;

    @Override
    public WorkSchedule save(WorkScheduleDto dto) {
        return repo.save(WorkSchedule.builder()
                .workedCode(dto.getWorkedCode())
                .pilotNo1(dto.getPilotNo1())
                .pilotNo2(dto.getPilotNo2())
                .coId(dto.getCoId())
                .shipId(dto.getShipId())
                .droneId1(dto.getDroneId1())
                .droneId2(dto.getDroneId2())
                .gcsIp(dto.getGcsIp())
                .datalinkIp(dto.getDatalinkIp())
                .startAt(dto.getStartAt())
                .endAt(dto.getEndAt())
                .sparePartsCode(dto.getSparePartsCode())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<WorkSchedule> update(String code, WorkScheduleDto dto) {
        return repo.findById(code).map(existing -> {
            existing.setPilotNo1(dto.getPilotNo1());
            existing.setPilotNo2(dto.getPilotNo2());
            existing.setCoId(dto.getCoId());
            existing.setShipId(dto.getShipId());
            existing.setDroneId1(dto.getDroneId1());
            existing.setDroneId2(dto.getDroneId2());
            existing.setGcsIp(dto.getGcsIp());
            existing.setDatalinkIp(dto.getDatalinkIp());
            existing.setStartAt(dto.getStartAt());
            existing.setEndAt(dto.getEndAt());
            existing.setSparePartsCode(dto.getSparePartsCode());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<WorkSchedule> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<WorkSchedule> findById(String code) {
        return repo.findById(code);
    }

    @Override
    public void delete(String code) {
        repo.deleteById(code);
    }
}
