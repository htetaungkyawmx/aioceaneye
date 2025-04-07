package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.QuestionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionInfoRepo extends JpaRepository<QuestionInfo, Integer> {

}