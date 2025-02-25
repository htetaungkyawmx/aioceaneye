package org.mdt.aioceaneye.dto.ship;

import org.mdt.aioceaneye.model.Ship;

public record ShipRegisterForm(
        String shipName,
        String shipCallSign,
//        String company,
        String shipCountry,
        String shipOfficeNo,
        String shipImono,
        String shipMmsi,
        String shipPhone,
        String shipEmail,
        String shipLogo,
        Double yield
) {

    public static Ship toEntity(ShipRegisterForm form) {
        return Ship.builder()
                .shipName(form.shipName)
                .shipCallSign(form.shipCallSign)
                .shipCountry(form.shipCountry)
                .shipOfficeNo(form.shipOfficeNo)
                .shipImono(form.shipImono)
                .shipMmsi(form.shipMmsi)
                .shipPhone(form.shipPhone)
                .shipEmail(form.shipEmail)
                .shipLogo(form.shipLogo)
                .yield(form.yield)
                .build();
    }
}
