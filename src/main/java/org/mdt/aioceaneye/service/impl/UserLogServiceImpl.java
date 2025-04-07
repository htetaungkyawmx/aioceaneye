package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.UserLogDto;
import org.mdt.aioceaneye.model.UserLog;
import org.mdt.aioceaneye.repository.UserLogRepo;
import org.mdt.aioceaneye.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserLogServiceImpl implements UserLogService {

    @Autowired
    private UserLogRepo repo;

    @Override
    public UserLog save(UserLogDto dto) {
        return repo.save(UserLog.builder()
                .userEmail(dto.getUserEmail())
                .connectedIp(dto.getConnectedIp())
                .connectAt(dto.getConnectAt())
                .closeAt(dto.getCloseAt())
                .build());
    }

    @Override
    public Optional<UserLog> update(String email, UserLogDto dto) {
        return repo.findById(email).map(existing -> {
            existing.setConnectedIp(dto.getConnectedIp());
            existing.setConnectAt(dto.getConnectAt());
            existing.setCloseAt(dto.getCloseAt());
            return repo.save(existing);
        });
    }

    @Override
    public List<UserLog> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UserLog> findById(String email) {
        return repo.findById(email);
    }

    @Override
    public void delete(String email) {
        repo.deleteById(email);
    }
}
