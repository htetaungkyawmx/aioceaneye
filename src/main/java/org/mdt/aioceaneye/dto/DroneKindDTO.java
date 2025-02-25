package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneKindDTO {
    private int kind_id;
    private String kind;
    private String characteristics;
    private String application;
}
