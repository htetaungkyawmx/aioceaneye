package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.DroneKindDto;
import org.mdt.aioceaneye.model.DroneKind;
import org.mdt.aioceaneye.repository.DroneKindRepo;
import org.mdt.aioceaneye.service.DroneKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneKindServiceImpl implements DroneKindService {

    @Autowired
    private DroneKindRepo repo;

    @Override
    public DroneKind save(DroneKindDto dto) {
        return repo.save(DroneKind.builder()
                .kindId(dto.getKindId())
                .kind(dto.getKind())
                .characteristics(dto.getCharacteristics())
                .application(dto.getApplication())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<DroneKind> update(int id, DroneKindDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setKind(dto.getKind());
            existing.setCharacteristics(dto.getCharacteristics());
            existing.setApplication(dto.getApplication());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<DroneKind> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<DroneKind> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}

