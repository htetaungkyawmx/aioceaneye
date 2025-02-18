package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long> {
}
