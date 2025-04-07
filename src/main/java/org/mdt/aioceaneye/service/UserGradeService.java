package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.UserGradeDto;
import org.mdt.aioceaneye.model.UserGrade;

import java.util.List;
import java.util.Optional;

public interface UserGradeService {
    UserGrade save(UserGradeDto dto);
    Optional<UserGrade> update(Integer id, UserGradeDto dto);
    List<UserGrade> findAll();
    Optional<UserGrade> findById(Integer id);
    void delete(Integer id);
}
