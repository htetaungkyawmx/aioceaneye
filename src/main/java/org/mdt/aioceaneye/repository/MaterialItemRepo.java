package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.MaterialItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialItemRepo extends JpaRepository<MaterialItem, String> {

}

