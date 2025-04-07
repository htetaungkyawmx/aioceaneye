package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ManualDto;
import org.mdt.aioceaneye.model.Manual;

import java.util.List;
import java.util.Optional;

public interface ManualService {
    Manual save(ManualDto dto);
    List<Manual> findAll();
    Optional<Manual> findById(int id);
    void delete(int id);
}
