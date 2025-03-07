package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.DroneModel;

public record DroneModelCreateForm(
        String modelName,
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

    public static DroneModel toEntity(DroneModelCreateForm form) {

        return DroneModel.builder()
                .modelName(form.modelName)
                .modelNo(form.modelNo)
                .manufacturer(form.manufacturer)
                .size(form.size)
                .weight(form.weight)
                .maxRadius(form.maxRadius)
                .maxSpeed(form.maxSpeed)
                .flightTime(form.flightTime)
                .maxAltitude(form.maxAltitude)
                .build();
    }
}
