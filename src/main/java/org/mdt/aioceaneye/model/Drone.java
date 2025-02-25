package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "Drones_t")
public class Drone extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    //private int kind_id;
}
