package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.FishInfoDto;
import org.mdt.aioceaneye.model.FishInfo;
import org.mdt.aioceaneye.repository.FishInfoRepo;
import org.mdt.aioceaneye.service.FishInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishInfoServiceImpl implements FishInfoService {

    @Autowired
    private FishInfoRepo repo;

    @Override
    public FishInfo save(FishInfoDto dto) {
        return repo.save(FishInfo.builder()
                .fishId(dto.getFishId())
                .fishName(dto.getFishName())
                .fishDescription(dto.getFishDescription())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<FishInfo> update(Integer id, FishInfoDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setFishName(dto.getFishName());
            existing.setFishDescription(dto.getFishDescription());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<FishInfo> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<FishInfo> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
