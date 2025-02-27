package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "drones_t")
public class Drone extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long droneId;
    private String serial_no;
    private String droneImg;

    @ManyToOne
    @JoinColumn(name = "model_no")
    private DroneModelInfo modelInfo;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "drone")
    private DroneEquippedMaterials droneEquippedMaterials;

    public void setModelInfo(DroneModelInfo modelInfo) {
        this.modelInfo = modelInfo;
        modelInfo.addDrone(this);
    }
}
