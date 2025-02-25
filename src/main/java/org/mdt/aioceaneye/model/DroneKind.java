package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "Drone_Kind_t")
public class DroneKind extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kind_id;
    private String kind;
    private String characteristics;
    private String application;
}
