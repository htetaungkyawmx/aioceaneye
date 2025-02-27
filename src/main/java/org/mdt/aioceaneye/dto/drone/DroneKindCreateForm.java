package org.mdt.aioceaneye.dto.drone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.model.DroneKind;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneKindCreateForm {

    private String kind;
    private String characteristics;
    private String application;

    public static DroneKind toEntity(DroneKindCreateForm form) {
        return DroneKind.builder()
                .kind(form.getKind())
                .characteristics(form.getCharacteristics())
                .application(form.getApplication())
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
