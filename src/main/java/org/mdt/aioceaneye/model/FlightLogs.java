package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import lombok.*;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class FlightLogs {

    private LocalDateTime receiveAt;

    private String clientIp;

    private Drones drones;

    private String lat;

    private String lon;

    private String alt;

    private String distTraveled;

    private String wpDist;

    private String distToHome;

    private String verticalSpeed;

    private String windVel;

    private String airSpeed;

    private String groundSpeed;

    private String roll;

    private String pitch;

    private String yaw;

    private String toh;

    private String timeInAir;

    private String timeInAirMinSec;

    private String gpsHDop;

    private String batteryVoltage;

    private String batteryCurrent;

    private String ch3Percent;

    private String ch3Out;

    private String ch9Out;

    private String ch10Out;

    private String ch10OUt;

    private String ch11Out;

    private String ch12Out;

    private Text wayPoint;

    private Ships ships;

    private Pilots pilotsInId;

    private Pilots pilotOutId;

    private LocalDateTime createdAt;


}
