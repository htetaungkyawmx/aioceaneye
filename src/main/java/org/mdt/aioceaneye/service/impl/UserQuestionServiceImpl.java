package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.UserQuestionDto;
import org.mdt.aioceaneye.model.UserQuestion;
import org.mdt.aioceaneye.repository.UserQuestionRepo;
import org.mdt.aioceaneye.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserQuestionServiceImpl implements UserQuestionService {

    @Autowired
    private UserQuestionRepo repo;

    @Override
    public UserQuestion save(UserQuestionDto dto) {
        UserQuestion entity = UserQuestion.builder()
                .questionCode(dto.getQuestionCode())
                .subject(dto.getSubject())
                .question(dto.getQuestion())
                .answer(dto.getAnswer())
                .opinion(dto.getOpinion())
                .createdAt(dto.getCreatedAt())
                .createdUsername(dto.getCreatedUsername())
                .createdEmail(dto.getCreatedEmail())
                .answerEmail(dto.getAnswerEmail())
                .build();
        return repo.save(entity);
    }

    @Override
    public Optional<UserQuestion> update(int id, UserQuestionDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setSubject(dto.getSubject());
            existing.setQuestion(dto.getQuestion());
            existing.setAnswer(dto.getAnswer());
            existing.setOpinion(dto.getOpinion());
            existing.setAnswerEmail(dto.getAnswerEmail());
            return repo.save(existing);
        });
    }

    @Override
    public List<UserQuestion> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UserQuestion> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
