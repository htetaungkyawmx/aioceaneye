package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PreFlightLog {

    @Id
    private String flightlogId;

    private Date flightAt;
    private Integer droneId;
    private Integer flightCount;
    private Integer sailCount;
    private String shipId;
    private String flightstepType;
    private String workedCode;
    private String checklistResponse;
    private String catchArea;

    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
