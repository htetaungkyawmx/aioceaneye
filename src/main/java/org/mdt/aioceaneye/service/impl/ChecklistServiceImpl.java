package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.ChecklistDto;
import org.mdt.aioceaneye.model.Checklist;
import org.mdt.aioceaneye.repository.ChecklistRepo;
import org.mdt.aioceaneye.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChecklistServiceImpl implements ChecklistService {

    @Autowired
    private ChecklistRepo repo;

    @Override
    public Checklist save(ChecklistDto dto) {
        return repo.save(Checklist.builder()
                .checklistCode(dto.getChecklistCode())
                .checklistName(dto.getChecklistName())
                .checklistType(dto.getChecklistType())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<Checklist> update(String id, ChecklistDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setChecklistName(dto.getChecklistName());
            existing.setChecklistType(dto.getChecklistType());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<Checklist> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Checklist> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
