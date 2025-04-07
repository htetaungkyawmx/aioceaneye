package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.FrequentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequentQuestionRepo extends JpaRepository<FrequentQuestion, Integer> {

}