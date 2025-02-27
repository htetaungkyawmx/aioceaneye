package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "drone_kinds_t")
public class DroneKind extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kind_id;
    private String kind;
    private String characteristics;
    private String application;

    @OneToOne(mappedBy = "kind")
    private DroneModelInfo modelInfo;

}
