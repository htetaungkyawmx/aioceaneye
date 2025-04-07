package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.EdgeServerInfoDto;
import org.mdt.aioceaneye.model.EdgeServerInfo;

import java.util.List;
import java.util.Optional;

public interface EdgeServerInfoService {
    EdgeServerInfo save(EdgeServerInfoDto dto);
    Optional<EdgeServerInfo> update(Integer id, EdgeServerInfoDto dto);
    List<EdgeServerInfo> findAll();
    Optional<EdgeServerInfo> findById(Integer id);
    void delete(Integer id);
}
