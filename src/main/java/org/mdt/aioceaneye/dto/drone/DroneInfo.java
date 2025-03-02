package org.mdt.aioceaneye.dto.drone;

public record DroneInfo(
        String serialNo,
        String droneImg,
        String modelName,
        String droneId,
        String fc,
        String gps
) {

}
