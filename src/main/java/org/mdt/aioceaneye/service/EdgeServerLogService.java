package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.EdgeServerLogDto;
import org.mdt.aioceaneye.dto.EdgeServerLogKey;
import org.mdt.aioceaneye.model.EdgeServerLog;

import java.util.List;
import java.util.Optional;

public interface EdgeServerLogService {
    EdgeServerLog save(EdgeServerLogDto dto);
    Optional<EdgeServerLog> update(EdgeServerLogKey id, EdgeServerLogDto dto);
    List<EdgeServerLog> findAll();
    Optional<EdgeServerLog> findById(EdgeServerLogKey id);
    void delete(EdgeServerLogKey id);
}
