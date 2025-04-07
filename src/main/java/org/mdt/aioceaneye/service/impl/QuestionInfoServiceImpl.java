package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.QuestionInfoDto;
import org.mdt.aioceaneye.model.QuestionInfo;
import org.mdt.aioceaneye.repository.QuestionInfoRepo;
import org.mdt.aioceaneye.service.QuestionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionInfoServiceImpl implements QuestionInfoService {

    @Autowired
    private QuestionInfoRepo repo;

    @Override
    public QuestionInfo save(QuestionInfoDto dto) {
        QuestionInfo entity = QuestionInfo.builder()
                .questionCode(dto.getQuestionCode())
                .questionType(dto.getQuestionType())
                .build();
        return repo.save(entity);
    }

    @Override
    public Optional<QuestionInfo> update(int code, QuestionInfoDto dto) {
        return repo.findById(code).map(existing -> {
            existing.setQuestionType(dto.getQuestionType());
            return repo.save(existing);
        });
    }

    @Override
    public List<QuestionInfo> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<QuestionInfo> findById(int code) {
        return repo.findById(code);
    }

    @Override
    public void delete(int code) {
        repo.deleteById(code);
    }
}
