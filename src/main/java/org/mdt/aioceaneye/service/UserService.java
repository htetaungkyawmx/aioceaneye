package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.UserDto;
import org.mdt.aioceaneye.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(UserDto dto);
    Optional<User> update(String email, UserDto dto);
    List<User> findAll();
    Optional<User> findById(String email);
    void delete(String email);
}
