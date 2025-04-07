package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.UserGradeDto;
import org.mdt.aioceaneye.model.UserGrade;
import org.mdt.aioceaneye.repository.UserGradeRepo;
import org.mdt.aioceaneye.service.UserGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserGradeServiceImpl implements UserGradeService {

    @Autowired
    private UserGradeRepo repo;

    @Override
    public UserGrade save(UserGradeDto dto) {
        return repo.save(UserGrade.builder()
                .gradeCode(dto.getGradeCode())
                .gradeName(dto.getGradeName())
                .build());
    }

    @Override
    public Optional<UserGrade> update(Integer id, UserGradeDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setGradeName(dto.getGradeName());
            return repo.save(existing);
        });
    }

    @Override
    public List<UserGrade> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UserGrade> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
