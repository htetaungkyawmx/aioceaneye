package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogRepo extends JpaRepository<UserLog, String> {

}

