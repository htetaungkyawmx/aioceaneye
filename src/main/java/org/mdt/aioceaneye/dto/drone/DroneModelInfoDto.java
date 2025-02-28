package org.mdt.aioceaneye.dto.drone;

import org.mdt.aioceaneye.model.DroneModel;

public record DroneModelInfoDto(
        String modelNo,
        String manufacturer,
        String size,
        double weight,
        double maxRadius,
        double maxSpeed,
        int flightTime,
        int maxAltitude,
        String kind
) {

    public static DroneModelInfoDto toDto(DroneModel model) {
        return new DroneModelInfoDto(
                model.getModelNo(),
                model.getManufacturer(),
                model.getSize(),
                model.getWeight(),
                model.getMaxRadius(),
                model.getMaxSpeed(),
                model.getFlightTime(),
                model.getMaxAltitude(),
                model.getKind().getKind()
        );
    }
}
