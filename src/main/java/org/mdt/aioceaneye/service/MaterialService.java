package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.MaterialDto;
import org.mdt.aioceaneye.model.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialService {
    Material save(MaterialDto dto);
    Optional<Material> update(String id, MaterialDto dto);
    List<Material> findAll();
    Optional<Material> findById(String id);
    void delete(String id);
}
