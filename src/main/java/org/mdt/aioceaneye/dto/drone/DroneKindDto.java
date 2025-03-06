package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.DroneKind;

public record DroneKindDto(
        Integer kind_id,
        String kind,
        String characteristics,
        String application
) {

    public static DroneKindDto toDto(DroneKind droneKind) {
        return new DroneKindDto(
                droneKind.getKind_id(),
                droneKind.getKind(),
                droneKind.getCharacteristics(),
                droneKind.getApplication()
        );
    }
}
