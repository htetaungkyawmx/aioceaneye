package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.MaterialItemDto;
import org.mdt.aioceaneye.model.MaterialItem;
import org.mdt.aioceaneye.repository.MaterialItemRepo;
import org.mdt.aioceaneye.service.MaterialItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialItemServiceImpl implements MaterialItemService {

    @Autowired
    private MaterialItemRepo repo;

    @Override
    public MaterialItem save(MaterialItemDto dto) {
        return repo.save(MaterialItem.builder()
                .materialId(dto.getMaterialId())
                .materialItem(dto.getMaterialItem())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<MaterialItem> update(String id, MaterialItemDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setMaterialItem(dto.getMaterialItem());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<MaterialItem> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<MaterialItem> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
