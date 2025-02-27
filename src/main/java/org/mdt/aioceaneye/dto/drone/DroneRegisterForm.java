package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.Drone;

public record DroneRegisterForm(
        String droneImg,
        String modelName,
        String serialNo,
        long droneId,
        String fcSN,
        String gpsSN,
        String cameraSN,
        String rcSN,
        String converterSN,
        String pbSN,
        String ubcSN,
        String airSpeedSN,
        String dataLinkAirSN,
        String dataLinkGroundSN,
        String servoLASN,
        String servoRASN,
        String servoESN,
        String servoRSN,
        String motor1SN,
        String motor2SN,
        String motor3SN,
        String motor4SN,
        String prop1SN,
        String prop2SN,
        String prop3SN,
        String prop4SN,
        String fixEscSN,
        String fixPropSN
) {

    public static Drone toEntity(DroneRegisterForm form) {
        return Drone.builder()
                .droneId(form.droneId)
                .serial_no(form.serialNo)
                .droneImg(form.droneImg)
                .build();
    }
}
