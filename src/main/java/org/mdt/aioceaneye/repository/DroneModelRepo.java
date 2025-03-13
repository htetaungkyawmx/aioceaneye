package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.DroneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DroneModelRepo extends JpaRepository<DroneModel, Integer> {

    @Query("""
    select count(m) > 0 from DroneModel m where m.modelName=:modelName and m.modelNo=:modelNo
""")
    boolean existsByModel(String modelName, String modelNo);

    @Query("""
    select m from DroneModel m where m.modelName=:modelName and m.modelNo=:modelNo
""")
    Optional<DroneModel> findByModel(String modelName, String modelNo);
}
