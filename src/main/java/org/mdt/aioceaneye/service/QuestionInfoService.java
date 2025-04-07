package org.mdt.aioceaneye.service;

import org.mdt.aioceaneye.dto.QuestionInfoDto;
import org.mdt.aioceaneye.model.QuestionInfo;

import java.util.List;
import java.util.Optional;

public interface QuestionInfoService {
    QuestionInfo save(QuestionInfoDto dto);
    Optional<QuestionInfo> update(int code, QuestionInfoDto dto);
    List<QuestionInfo> findAll();
    Optional<QuestionInfo> findById(int code);
    void delete(int code);
}
