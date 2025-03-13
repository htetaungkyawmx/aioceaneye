package org.mdt.aioceaneye.dto.ship;

import org.mdt.aioceaneye.model.Ship;

import java.time.LocalDate;

public record ShipRegistrationForm(
        String shipName,
        String shipCallSign,
        int coId,
        String shipCountry,
        String shipOfficeNo,
        String shipImono,
        String shipAddress,
        String shipMmsi,
        String shipPhone,
        String shipEmail,
        Double yield,
        LocalDate buildYear,
        String shipLogo,
        String captainName,
        String mate1Name,
        String mate2Name,
        String mate3Name,
        String captainEmail,
        String mate1Email,
        String mate2Email,
        String mate3Email
) {

    public static Ship toEntity(ShipRegistrationForm form) {
        return Ship.builder()
                .shipName(form.shipName)
                .shipCallSign(form.shipCallSign)
                .shipCountry(form.shipCountry)
                .shipOfficeNo(form.shipOfficeNo)
                .shipImono(form.shipImono)
                .shipAddress(form.shipAddress)
                .shipMmsi(form.shipMmsi)
                .shipPhone(form.shipPhone)
                .shipEmail(form.shipEmail)
                .shipLogo(form.shipLogo)
                .yield(form.yield)
                .buildYear(form.buildYear)
                .shipCaptainName(form.captainName)
                .ship1thName(form.mate1Name)
                .ship2thName(form.mate2Name)
                .ship3thName(form.mate3Name)
                .shipCaptainEmail(form.captainEmail)
                .ship1thEmail(form.mate1Email)
                .ship2thEmail(form.mate2Email)
                .ship3thEmail(form.mate3Email)
                .build();
    }
}
