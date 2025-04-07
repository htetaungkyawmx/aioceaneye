package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.SparePartDto;
import org.mdt.aioceaneye.model.SparePart;
import org.mdt.aioceaneye.repository.SparePartRepo;
import org.mdt.aioceaneye.service.SparePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SparePartServiceImpl implements SparePartService {

    @Autowired
    private SparePartRepo repo;

    @Override
    public SparePart save(SparePartDto dto) {
        return repo.save(SparePart.builder()
                .sparePartsCode(dto.getSparePartsCode())
                .materialSerialno(dto.getMaterialSerialno())
                .materialItem(dto.getMaterialItem())
                .build());
    }

    @Override
    public Optional<SparePart> update(Integer id, SparePartDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setMaterialSerialno(dto.getMaterialSerialno());
            existing.setMaterialItem(dto.getMaterialItem());
            return repo.save(existing);
        });
    }

    @Override
    public List<SparePart> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<SparePart> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
