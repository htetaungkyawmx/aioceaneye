package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneLoadoutDto {
    private Integer droneId;
    private String materialSerialNo;
    private String materialItem;
}
