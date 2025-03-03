package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

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


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "drone_loadout_t")
    @MapKeyColumn(name = "material_type")
    private Map<String, Material> materials;

    public void setDroneModel(DroneModel droneModel) {
        this.droneModel = droneModel;
        droneModel.addDrone(this);
    }

    public void equipMaterial(Material material) {
       materials.put(material.getType().getTypeName(), material);
    }

}
