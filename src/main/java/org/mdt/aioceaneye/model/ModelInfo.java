package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModelInfo {
    @Id
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
