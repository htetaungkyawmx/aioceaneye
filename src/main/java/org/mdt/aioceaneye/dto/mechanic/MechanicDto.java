package org.mdt.aioceaneye.dto.mechanic;

import org.mdt.aioceaneye.model.Mechanic;
import org.mdt.aioceaneye.model.enums.MechanicPosition;

public record MechanicDto(
        String mechanicId,
        String mechanicName,
        String mechanicEmail,
        MechanicPosition mechanicPosition,
        String mechanicPhone,
        String mechanicImg,
        String mechanicSign
) {

    public static Mechanic toEntity(MechanicDto form) {
        return Mechanic.builder()
                .mechanicId(form.mechanicId)
                .mechanicName(form.mechanicName)
                .mechanicEmail(form.mechanicEmail)
                .mechanicPosition(form.mechanicPosition)
                .mechanicPhone(form.mechanicPhone)
                .mechanicImg(form.mechanicImg)
                .mechanicSign(form.mechanicSign)
                .build();
    }

    public static MechanicDto toDto(Mechanic mechanic) {
        return new MechanicDto(
                mechanic.getMechanicId(),
                mechanic.getMechanicName(),
                mechanic.getMechanicEmail(),
                mechanic.getMechanicPosition(),
                mechanic.getMechanicPhone(),
                mechanic.getMechanicImg(),
                mechanic.getMechanicSign()
        );
    }
}
