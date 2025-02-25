package org.mdt.aioceaneye.dto.pilot;

import org.mdt.aioceaneye.model.Pilot;
import org.mdt.aioceaneye.model.enums.PilotStatus;

public record PilotRegisterForm(
        String pilotName,
        String pilotId,
        String pilotCerNo,
        String pilotPassport,
        String pilotEmail,
        String pilotPhone,
        String pilotCountry,
        String pilotImg,
        PilotStatus pilotStatus
) {

    public static Pilot toEntity(PilotRegisterForm form) {
        return Pilot.builder()
                .pilotName(form.pilotName)
                .pilotId(form.pilotId)
                .pilotCerNo(form.pilotCerNo)
                .pilotPassport(form.pilotPassport)
                .pilotEmail(form.pilotEmail)
                .pilotPhone(form.pilotPhone)
                .pilotCountry(form.pilotCountry)
                .pilotImg(form.pilotImg)
                .pilotStatus(form.pilotStatus)
                .build();
    }
}
