package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.DroneModel;

public record DroneModelInfoCreateForm(
        String modelNo,
        String manufacturer,
        String size,
        double weight,
        double maxRadius,
        double maxSpeed,
        int flightTime,
        int maxAltitude,
        int kindId
) {

    public static DroneModel toEntity(DroneModelInfoCreateForm model) {
        return DroneModel.builder()
                .modelNo(model.modelNo)
                .manufacturer(model.manufacturer)
                .size(model.size)
                .weight(model.weight)
                .maxRadius(model.maxRadius)
                .maxSpeed(model.maxSpeed)
                .flightTime(model.flightTime)
                .maxAltitude(model.maxAltitude)
                .build();
    }
}
