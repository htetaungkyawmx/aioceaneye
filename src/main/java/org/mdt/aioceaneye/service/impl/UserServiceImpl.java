package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.UserDto;
import org.mdt.aioceaneye.model.User;
import org.mdt.aioceaneye.repository.UserRepo;
import org.mdt.aioceaneye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User save(UserDto dto) {
        return repo.save(User.builder()
                .userEmail(dto.getUserEmail())
                .userName(dto.getUserName())
                .userPassword(dto.getUserPassword())
                .gradeCode(dto.getGradeCode())
                .status(dto.getStatus())
                .checkedEmail(dto.getCheckedEmail())
                .createdAt(dto.getCreatedAt())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build());
    }

    @Override
    public Optional<User> update(String email, UserDto dto) {
        return repo.findById(email).map(existing -> {
            existing.setUserName(dto.getUserName());
            existing.setUserPassword(dto.getUserPassword());
            existing.setGradeCode(dto.getGradeCode());
            existing.setStatus(dto.getStatus());
            existing.setCheckedEmail(dto.getCheckedEmail());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<User> findById(String email) {
        return repo.findById(email);
    }

    @Override
    public void delete(String email) {
        repo.deleteById(email);
    }
}
