package org.mdt.aioceaneye.dto.drone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.model.DroneKind;

public record DroneKindCreateForm(
        String kind,
        String characteristics,
        String application
) {

    public static DroneKind toEntity(DroneKindCreateForm form) {
        return DroneKind.builder()
                .kind(form.kind())
                .characteristics(form.characteristics())
                .application(form.application())
                .build();
    }

    public static DroneKindCreateForm toDTO(DroneKind form) {
        return new DroneKindCreateForm(
                form.getKind(),
                form.getCharacteristics(),
                form.getApplication()
        );
    }
}
