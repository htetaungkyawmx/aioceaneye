package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.UserQuestionDto;
import org.mdt.aioceaneye.model.UserQuestion;

import java.util.List;
import java.util.Optional;

public interface UserQuestionService {
    UserQuestion save(UserQuestionDto dto);
    Optional<UserQuestion> update(int id, UserQuestionDto dto);
    List<UserQuestion> findAll();
    Optional<UserQuestion> findById(int id);
    void delete(int id);
}
