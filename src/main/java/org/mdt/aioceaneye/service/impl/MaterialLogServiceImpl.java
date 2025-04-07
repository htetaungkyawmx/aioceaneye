package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.MaterialLogDto;
import org.mdt.aioceaneye.dto.MaterialLogKey;
import org.mdt.aioceaneye.model.MaterialLog;
import org.mdt.aioceaneye.repository.MaterialLogRepo;
import org.mdt.aioceaneye.service.MaterialLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialLogServiceImpl implements MaterialLogService {

    @Autowired
    private MaterialLogRepo repo;

    @Override
    public MaterialLog save(MaterialLogDto dto) {
        return repo.save(MaterialLog.builder()
                .materialAt(dto.getMaterialAt())
                .materialSerialno(dto.getMaterialSerialno())
                .droneId(dto.getDroneId())
                .materialRepaircount(dto.getMaterialRepaircount())
                .docNo(dto.getDocNo())
                .materialUsagetime(dto.getMaterialUsagetime())
                .materialReplacetime(dto.getMaterialReplacetime())
                .materialReleaseat(dto.getMaterialReleaseat())
                .materialReturnat(dto.getMaterialReturnat())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<MaterialLog> update(MaterialLogKey id, MaterialLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setDroneId(dto.getDroneId());
            existing.setMaterialRepaircount(dto.getMaterialRepaircount());
            existing.setDocNo(dto.getDocNo());
            existing.setMaterialUsagetime(dto.getMaterialUsagetime());
            existing.setMaterialReplacetime(dto.getMaterialReplacetime());
            existing.setMaterialReleaseat(dto.getMaterialReleaseat());
            existing.setMaterialReturnat(dto.getMaterialReturnat());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<MaterialLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<MaterialLog> findById(MaterialLogKey id) {
        return repo.findById(id);
    }

    @Override
    public void delete(MaterialLogKey id) {
        repo.deleteById(id);
    }
}
