package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ManualDto;
import org.mdt.aioceaneye.model.Manual;
import org.mdt.aioceaneye.repository.ManualRepo;
import org.mdt.aioceaneye.service.ManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManualServiceImpl implements ManualService {

    @Autowired
    private ManualRepo repo;

    @Override
    public Manual save(ManualDto dto) {
        return repo.save(Manual.builder()
                .manualName(dto.getManualName())
                .manualPath(dto.getManualPath())
                .manualUsed(dto.getManualUsed())
                .createdAt(dto.getCreatedAt())
                .createdUsername(dto.getCreatedUsername())
                .build());
    }

    @Override
    public List<Manual> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Manual> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
