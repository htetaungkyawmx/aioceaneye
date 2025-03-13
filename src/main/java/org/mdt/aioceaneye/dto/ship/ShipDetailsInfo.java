package org.mdt.aioceaneye.dto.ship;

import java.time.LocalDate;

public record ShipDetailsInfo(
        String shipName,
        String shipCallSign,
        String companyName,
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
}
