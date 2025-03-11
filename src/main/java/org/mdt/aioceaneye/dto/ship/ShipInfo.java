package org.mdt.aioceaneye.dto.ship;

import org.mdt.aioceaneye.model.Ship;

public record ShipInfo(
        int shipId,
        String shipLogo,
        String shipName,
        String shipCountry,
        String shipImono,
        String shipMmsi,
        String shipCallSign,
        Double yield
) {

    public static ShipInfo toDto(Ship ship) {
        return new ShipInfo(
                ship.getShipId(),
                ship.getShipLogo(),
                ship.getShipName(),
                ship.getShipCountry(),
                ship.getShipImono(),
                ship.getShipMmsi(),
                ship.getShipCallSign(),
                ship.getYield()
        );
    }
}
