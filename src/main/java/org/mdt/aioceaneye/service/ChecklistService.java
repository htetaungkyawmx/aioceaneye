package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ChecklistDto;
import org.mdt.aioceaneye.model.Checklist;

import java.util.List;
import java.util.Optional;

public interface ChecklistService {
    Checklist save(ChecklistDto dto);
    Optional<Checklist> update(String id, ChecklistDto dto);
    List<Checklist> findAll();
    Optional<Checklist> findById(String id);
    void delete(String id);
}
