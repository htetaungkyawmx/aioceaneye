package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.ModelInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelInfoRepo extends JpaRepository<ModelInfo, String> {

}
