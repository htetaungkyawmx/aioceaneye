package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ModelInfoDto;
import org.mdt.aioceaneye.model.ModelInfo;
import org.mdt.aioceaneye.repository.ModelInfoRepo;
import org.mdt.aioceaneye.service.ModelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelInfoServiceImpl implements ModelInfoService {

    @Autowired
    private ModelInfoRepo repo;

    @Override
    public ModelInfo save(ModelInfoDto dto) {
        return repo.save(ModelInfo.builder()
                .modelNo(dto.getModelNo())
                .modelName(dto.getModelName())
                .manufacturerCountry(dto.getManufacturerCountry())
                .size(dto.getSize())
                .weight(dto.getWeight())
                .maxRadius(dto.getMaxRadius())
                .maxSpeed(dto.getMaxSpeed())
                .flightTime(dto.getFlightTime())
                .maxAltitude(dto.getMaxAltitude())
                .kindId(dto.getKindId())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<ModelInfo> update(String id, ModelInfoDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setModelName(dto.getModelName());
            existing.setManufacturerCountry(dto.getManufacturerCountry());
            existing.setSize(dto.getSize());
            existing.setWeight(dto.getWeight());
            existing.setMaxRadius(dto.getMaxRadius());
            existing.setMaxSpeed(dto.getMaxSpeed());
            existing.setFlightTime(dto.getFlightTime());
            existing.setMaxAltitude(dto.getMaxAltitude());
            existing.setKindId(dto.getKindId());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<ModelInfo> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ModelInfo> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
