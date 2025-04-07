package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepo extends JpaRepository<Material, String> {
}
