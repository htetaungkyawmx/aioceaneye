package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.FrequentQuestionDto;
import org.mdt.aioceaneye.model.FrequentQuestion;

import java.util.List;
import java.util.Optional;

public interface FrequentQuestionService {
    FrequentQuestion save(FrequentQuestionDto dto);
    Optional<FrequentQuestion> update(int id, FrequentQuestionDto dto);
    List<FrequentQuestion> findAll();
    Optional<FrequentQuestion> findById(int id);
    void delete(int id);
}
