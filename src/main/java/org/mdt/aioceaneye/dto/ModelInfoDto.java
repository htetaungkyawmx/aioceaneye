package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelInfoDto {
    private String modelNo;
    private String modelName;
    private String manufacturerCountry;
    private String size;
    private Double weight;
    private Double maxRadius;
    private Double maxSpeed;
    private Integer flightTime;
    private Integer maxAltitude;
    private Integer kindId;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}

