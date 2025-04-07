package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.ModelInfoDto;
import org.mdt.aioceaneye.model.ModelInfo;

import java.util.List;
import java.util.Optional;

public interface ModelInfoService {
    ModelInfo save(ModelInfoDto dto);
    Optional<ModelInfo> update(String id, ModelInfoDto dto);
    List<ModelInfo> findAll();
    Optional<ModelInfo> findById(String id);
    void delete(String id);
}
