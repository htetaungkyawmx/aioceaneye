package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.MaterialLogDto;
import org.mdt.aioceaneye.dto.MaterialLogKey;
import org.mdt.aioceaneye.model.MaterialLog;

import java.util.List;
import java.util.Optional;

public interface MaterialLogService {
    MaterialLog save(MaterialLogDto dto);
    Optional<MaterialLog> update(MaterialLogKey id, MaterialLogDto dto);
    List<MaterialLog> findAll();
    Optional<MaterialLog> findById(MaterialLogKey id);
    void delete(MaterialLogKey id);
}
