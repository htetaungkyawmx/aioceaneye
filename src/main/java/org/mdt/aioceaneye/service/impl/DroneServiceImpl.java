package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DroneDto;
import org.mdt.aioceaneye.model.Drone;
import org.mdt.aioceaneye.repository.DroneRepo;
import org.mdt.aioceaneye.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneServiceImpl implements DroneService {

    @Autowired
    private DroneRepo repo;

    @Override
    public Drone save(DroneDto dto) {
        return repo.save(Drone.builder()
                .modelNo(dto.getModelNo())
                .manageNo(dto.getManageNo())
                .manufactureNo(dto.getManufactureNo())
                .manufactureAt(dto.getManufactureAt())
                .certificationNo(dto.getCertificationNo())
                .versionNo(dto.getVersionNo())
                .manufactureUser(dto.getManufactureUser())
                .droneImgPath(dto.getDroneImgPath())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Drone> update(int id, DroneDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setModelNo(dto.getModelNo());
            existing.setManageNo(dto.getManageNo());
            existing.setManufactureNo(dto.getManufactureNo());
            existing.setManufactureAt(dto.getManufactureAt());
            existing.setCertificationNo(dto.getCertificationNo());
            existing.setVersionNo(dto.getVersionNo());
            existing.setManufactureUser(dto.getManufactureUser());
            existing.setDroneImgPath(dto.getDroneImgPath());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Drone> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Drone> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}

