package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.EdgeServerInfoDto;
import org.mdt.aioceaneye.model.EdgeServerInfo;
import org.mdt.aioceaneye.repository.EdgeServerInfoRepo;
import org.mdt.aioceaneye.service.EdgeServerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdgeServerInfoServiceImpl implements EdgeServerInfoService {

    @Autowired
    private EdgeServerInfoRepo repo;

    @Override
    public EdgeServerInfo save(EdgeServerInfoDto dto) {
        return repo.save(EdgeServerInfo.builder()
                .edgeserverName(dto.getEdgeserverName())
                .edgeserverIp(dto.getEdgeserverIp())
                .edgeserverPort(dto.getEdgeserverPort())
                .edgeserverVersion(dto.getEdgeserverVersion())
                .targetIp(dto.getTargetIp())
                .tartgetPort(dto.getTartgetPort())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<EdgeServerInfo> update(Integer id, EdgeServerInfoDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setEdgeserverName(dto.getEdgeserverName());
            existing.setEdgeserverIp(dto.getEdgeserverIp());
            existing.setEdgeserverPort(dto.getEdgeserverPort());
            existing.setEdgeserverVersion(dto.getEdgeserverVersion());
            existing.setTargetIp(dto.getTargetIp());
            existing.setTartgetPort(dto.getTartgetPort());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<EdgeServerInfo> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<EdgeServerInfo> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
