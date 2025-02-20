package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Drones extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dronesId;

    private String makeNo;

    private String modelNo;

    private String modelName;

    private String fcSerialNo;

    private String gpsSerialNo;

    private String rcSerialNo;

    private String convertSerialNo;

    private String ubcSerialNo;

    private String airSpeedSerialNo;

    private String cameraSerialNo;

    private String powerBdSerialNo;

    private String dataLinkAirSerialNo;

    private String dataLinkGroundSerialNo;

    private String server1SerialNo;

    private String server2SerialNo;

    private String server3SerialNo;

    private String server4SerialNo;

    private String motor1SerialNo;

    private String motor2SerialNo;

    private String motor3SerialNo;

    private String motor4SerialNo;

    private String prop1SerialNo;

    private String prop2SerialNo;

    private String prop3SerialNo;

    private String eProp4SerialNo;

    private String fixEscSerialNo;

    private String fixPropSerialNo;

    private LocalDateTime createdAt;

    private String createdUser;

    private LocalDate modifiedAt;

    private String modifiedUser;


}
