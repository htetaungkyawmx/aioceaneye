package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "drone_loadout_t")
public class DroneLoadout {

    @Id
    private Long droneId;

    @MapsId
    @OneToOne
    private Drone drone;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fc_serialno")
    private Material fc;

//    @OneToOne
//    @JoinColumn(name = "gps_serialno")
//    private Material gps;
//
//    @OneToOne
//    @JoinColumn(name = "camera_serialno")
//    private Material camera;
//
//    @OneToOne
//    @JoinColumn(name = "rc_serialno")
//    private Material rc;
//
//    @OneToOne
//    @JoinColumn(name = "converter_serialno")
//    private Material converter;
//
//    @OneToOne
//    @JoinColumn(name = "powerbd_serialno")
//    private Material powerBoard;
//
//    @OneToOne
//    @JoinColumn(name = "ubc_serialno")
//    private Material ubc;
//
//    @OneToOne
//    @JoinColumn(name = "airspeed_serialno")
//    private Material airSpeedSensor;
//
//    @OneToOne
//    @JoinColumn(name = "datalinkair_serialno")
//    private Material dataLinkAir;
//
//    @OneToOne
//    @JoinColumn(name = "datalinkground_serialno")
//    private Material dataLinkGround;
//
//    @OneToOne
//    @JoinColumn(name = "servor_la_serialno")
//    private Material servorLeftAileron;
//
//    @OneToOne
//    @JoinColumn(name = "servor_ra_serialno")
//    private Material servorRightAileron;
//
//    @OneToOne
//    @JoinColumn(name = "servor_e_serialno")
//    private Material servorElevator;
//
//    @OneToOne
//    @JoinColumn(name = "servor_r_serialno")
//    private Material servorRudder;
//
//    @OneToOne
//    @JoinColumn(name = "motor1_serialno")
//    private Material motor1;
//
//    @OneToOne
//    @JoinColumn(name = "motor2_serialno")
//    private Material motor2;
//
//    @OneToOne
//    @JoinColumn(name = "motor3_serialno")
//    private Material motor3;
//
//    @OneToOne
//    @JoinColumn(name = "motor4_serialno")
//    private Material motor4;
//
//    @OneToOne
//    @JoinColumn(name = "prop1_serialno")
//    private Material prop1;
//
//    @OneToOne
//    @JoinColumn(name = "prop2_serialno")
//    private Material prop2;
//
//    @OneToOne
//    @JoinColumn(name = "prop3_serialno")
//    private Material prop3;
//
//    @OneToOne
//    @JoinColumn(name = "prop4_serialno")
//    private Material prop4;
//
//    @OneToOne
//    @JoinColumn(name = "fixesc_serialno")
//    private Material fixesc;
//
//    @OneToOne
//    @JoinColumn(name = "fixprop_serialno")
//    private Material fixProp;
}
