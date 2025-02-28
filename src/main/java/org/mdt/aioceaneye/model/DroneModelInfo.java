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
@Table(name = "model_info_t")
public class DroneModelInfo extends AbstractEntity{

    @Id
    private String modelNo;
    private String manufacturer;
    private String size;
    private double weight;
    private double maxRadius;
    private double maxSpeed;
    private int flightTime;
    private int maxAltitude;

    @ManyToOne
    @JoinColumn(name = "kind_id")
    private DroneKind kind;

    @OneToMany(mappedBy = "modelInfo", cascade = CascadeType.ALL)
    private List<Drone> drones;

    public void addDrone(Drone drone) {
        this.drones.add(drone);
    }

    public void setDroneKind(DroneKind kind) {
        this.kind = kind;
        kind.addModelInfo(this);
    }
}
