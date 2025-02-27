package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.Drone;

public record DroneDto(
        String serial_no,
        String version_no,
        String modelName,
        String size,
        String max_radius,
        String max_speed,
        String flight_time,
        String max_altitude,
        String drone_img,
        String kind
) {

    public static DroneDto toDto(Drone drone) {
//        return new DroneDto(
//                drone.getSerial_no(),
//                drone.getVersion_no(),
//                drone.getModelName(),
//                drone.getSize(),
//                drone.getMax_radius(),
//                drone.getMax_speed(),
//                drone.getFlight_time(),
//                drone.getMax_altitude(),
//                drone.getDrone_img(),
//                drone.getDroneKind().getKind()
//        );
        return null;
    }
}
