package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.Drone;

import java.util.HashMap;
import java.util.List;

public record DroneRegisterForm(
        String droneImg,
        String modelName,
        String serialNo,
        List<String> materialSerialNos
)
{
    public static Drone toEntity(DroneRegisterForm form) {
        return Drone.builder()
                .serial_no(form.serialNo)
                .droneImg(form.droneImg)
                .materials(new HashMap<>())
                .build();
    }
}
