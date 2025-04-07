package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightLogDto {
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
