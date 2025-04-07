package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.UserLogDto;
import org.mdt.aioceaneye.model.UserLog;

import java.util.List;
import java.util.Optional;

public interface UserLogService {
    UserLog save(UserLogDto dto);
    Optional<UserLog> update(String email, UserLogDto dto);
    List<UserLog> findAll();
    Optional<UserLog> findById(String email);
    void delete(String email);
}
