package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneDTO {
    private Long droneId;
    private String serial_no;
    private String version_no;
    private String modelName;
    private String size;
    private String max_radius;
    private String max_speed;
    private String flight_time;
    private String max_altitude;
    private String max_endurance;
    private String drone_img;
}
