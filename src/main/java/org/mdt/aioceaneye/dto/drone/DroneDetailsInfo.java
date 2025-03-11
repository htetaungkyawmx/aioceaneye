package org.mdt.aioceaneye.dto.drone;

public record DroneDetailsInfo(
    String droneImg,
    String droneModel,
    String serialNo,
    long droneId,
    String manufacturer,
    String kind,
    String size,
    double weight,
    double maxRadius,
    double maxSpeed,
    int flightTime,
    int maxAltitude
) {
}
