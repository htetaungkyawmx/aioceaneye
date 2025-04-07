package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.EdgeServerLogDto;
import org.mdt.aioceaneye.dto.EdgeServerLogKey;
import org.mdt.aioceaneye.model.EdgeServerLog;
import org.mdt.aioceaneye.repository.EdgeServerLogRepo;
import org.mdt.aioceaneye.service.EdgeServerLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdgeServerLogServiceImpl implements EdgeServerLogService {

    @Autowired
    private EdgeServerLogRepo repo;

    @Override
    public EdgeServerLog save(EdgeServerLogDto dto) {
        return repo.save(EdgeServerLog.builder()
                .coneectAt(dto.getConeectAt())
                .edgeserverIp(dto.getEdgeserverIp())
                .connectedStatus(dto.getConnectedStatus())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<EdgeServerLog> update(EdgeServerLogKey id, EdgeServerLogDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setConnectedStatus(dto.getConnectedStatus());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<EdgeServerLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<EdgeServerLog> findById(EdgeServerLogKey id) {
        return repo.findById(id);
    }

    @Override
    public void delete(EdgeServerLogKey id) {
        repo.deleteById(id);
    }
}
