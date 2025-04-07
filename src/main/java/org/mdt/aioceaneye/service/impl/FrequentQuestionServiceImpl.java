package org.mdt.aioceaneye.service.impl;

import org.mdt.aioceaneye.dto.FrequentQuestionDto;
import org.mdt.aioceaneye.model.FrequentQuestion;
import org.mdt.aioceaneye.repository.FrequentQuestionRepo;
import org.mdt.aioceaneye.service.FrequentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrequentQuestionServiceImpl implements FrequentQuestionService {

    @Autowired
    private FrequentQuestionRepo repo;

    @Override
    public FrequentQuestion save(FrequentQuestionDto dto) {
        FrequentQuestion entity = FrequentQuestion.builder()
                .questionCode(dto.getQuestionCode())
                .question(dto.getQuestion())
                .answer(dto.getAnswer())
                .createdAt(dto.getCreatedAt())
                .createdUser(dto.getCreatedUser())
                .modifiedAt(dto.getModifiedAt())
                .modifiedUser(dto.getModifiedUser())
                .build();
        return repo.save(entity);
    }

    @Override
    public Optional<FrequentQuestion> update(int id, FrequentQuestionDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setQuestion(dto.getQuestion());
            existing.setAnswer(dto.getAnswer());
            existing.setModifiedAt(dto.getModifiedAt());
            existing.setModifiedUser(dto.getModifiedUser());
            return repo.save(existing);
        });
    }

    @Override
    public List<FrequentQuestion> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<FrequentQuestion> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
