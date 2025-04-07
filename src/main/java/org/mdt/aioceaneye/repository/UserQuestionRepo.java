package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuestionRepo extends JpaRepository<UserQuestion, Integer> {

}
