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
    @JoinColumn(name = "drone_model_no")
    private DroneModel droneModel;

    @OneToOne(mappedBy = "drone", cascade = CascadeType.ALL, orphanRemoval = true)
    private DroneEquippedMaterials equippedMaterials;

    public void setDroneModel(DroneModel droneModel) {
        this.droneModel = droneModel;
        droneModel.addDrone(this);
    }

}
