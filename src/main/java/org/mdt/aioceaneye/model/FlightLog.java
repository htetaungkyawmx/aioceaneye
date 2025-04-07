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
public class FlightLog {
    @Id
    private String flightlogId;
    private Timestamp flightAt;
    private Integer droneId;
    private Integer flightCount;
    private Integer sailCount;
    private String flightstepType;
    private String workedCode;
    private String checklistResponse;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
