package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.MaterialDto;
import org.mdt.aioceaneye.model.Material;
import org.mdt.aioceaneye.repository.MaterialRepo;
import org.mdt.aioceaneye.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepo repo;

    @Override
    public Material save(MaterialDto dto) {
        return repo.save(Material.builder()
                .materialSerialno(dto.getMaterialSerialno())
                .materialId(dto.getMaterialId())
                .materialModel(dto.getMaterialModel())
                .materialCo(dto.getMaterialCo())
                .materialStorage(dto.getMaterialStorage())
                .stockDate(dto.getStockDate())
                .materialLifetime(dto.getMaterialLifetime())
                .materialUsagetime(dto.getMaterialUsagetime())
                .materialReplacetime(dto.getMaterialReplacetime())
                .materialImgPath(dto.getMaterialImgPath())
                .useStatus(dto.getUseStatus())
                .useNo(dto.getUseNo())
                .companyOfBuy(dto.getCompanyOfBuy())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Material> update(String id, MaterialDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setMaterialId(dto.getMaterialId());
            existing.setMaterialModel(dto.getMaterialModel());
            existing.setMaterialCo(dto.getMaterialCo());
            existing.setMaterialStorage(dto.getMaterialStorage());
            existing.setStockDate(dto.getStockDate());
            existing.setMaterialLifetime(dto.getMaterialLifetime());
            existing.setMaterialUsagetime(dto.getMaterialUsagetime());
            existing.setMaterialReplacetime(dto.getMaterialReplacetime());
            existing.setMaterialImgPath(dto.getMaterialImgPath());
            existing.setUseStatus(dto.getUseStatus());
            existing.setUseNo(dto.getUseNo());
            existing.setCompanyOfBuy(dto.getCompanyOfBuy());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Material> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Material> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
