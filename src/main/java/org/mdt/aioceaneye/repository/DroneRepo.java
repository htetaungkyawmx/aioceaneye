package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DroneRepo extends JpaRepository<Drone, Long> {

    @Query("""
    select new org.mdt.aioceaneye.dto.drone.DroneInfo(d.serial_no, d.droneImg, m.modelNo, d.droneId, l.fc.serialNumber) from Drone d
    join d.droneModel m on d.droneModel.modelNo = m.modelNo
    join d.droneLoadout l on d.droneId = l.droneId
""")
    List<DroneInfo> getAllDroneInfos();
}
