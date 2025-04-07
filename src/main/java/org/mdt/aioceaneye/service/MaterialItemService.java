package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.MaterialItemDto;
import org.mdt.aioceaneye.model.MaterialItem;

import java.util.List;
import java.util.Optional;

public interface MaterialItemService {
    MaterialItem save(MaterialItemDto dto);
    Optional<MaterialItem> update(String id, MaterialItemDto dto);
    List<MaterialItem> findAll();
    Optional<MaterialItem> findById(String id);
    void delete(String id);
}
