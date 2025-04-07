package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistRepo extends JpaRepository<Checklist, String> {

}
