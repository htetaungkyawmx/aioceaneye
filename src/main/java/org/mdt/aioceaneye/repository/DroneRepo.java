package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.drone.DroneDetailsInfo;
import org.mdt.aioceaneye.dto.drone.DroneInfo;
import org.mdt.aioceaneye.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DroneRepo extends JpaRepository<Drone, Long> {

    @Query("""
    select new org.mdt.aioceaneye.dto.drone.DroneInfo(d.serial_no, d.droneImg, CONCAT(m.modelName, "-", m.modelNo) , d.droneId, fc.serialNumber, gps.serialNumber) from Drone d
    join d.droneModel m on d.droneModel.modelId = m.modelId
    left join d.materials fc on fc.type.typeName = 'FC'
    left join d.materials gps on gps.type.typeName = 'GPS'
""")
    List<DroneInfo> getAllDroneInfos();

    @Query("""
    select new org.mdt.aioceaneye.dto.drone.DroneDetailsInfo(d.droneImg, CONCAT(m.modelName, "-", m.modelNo), d.serial_no, d.droneId, m.manufacturer, m.kind.kind, m.size, m.weight, m.maxRadius, m.maxSpeed, m.flightTime, m.maxAltitude ) from Drone d
    join d.droneModel m on d.droneModel.modelId = m.modelId
""")
    DroneDetailsInfo getDroneDetailsInfoByDroneId(long droneId);
}
