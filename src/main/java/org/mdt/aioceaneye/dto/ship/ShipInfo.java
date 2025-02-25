package org.mdt.aioceaneye.dto.ship;

import org.mdt.aioceaneye.model.Ship;

public record ShipInfo(
        Long shipId,
        String shipLogo,
        String shipName,
        String shipCountry,
        String shipImono,
        String shipMmsi,
        String shipCallSign
) {

    public static ShipInfo toDto(Ship ship) {
        return new ShipInfo(
                ship.getShipId(),
                ship.getShipLogo(),
                ship.getShipName(),
                ship.getShipCountry(),
                ship.getShipImono(),
                ship.getShipMmsi(),
                ship.getShipCallSign()
        );
    }
}
