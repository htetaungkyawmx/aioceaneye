package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InFlightLogDto {
    private String flightlogId;
    private Date flightAt;
    private Integer droneId;
    private Integer flightCount;
    private Integer sailCount;
    private String shipId;
    private String flightstepType;
    private String workedCode;
    private String checklistResponse;
    private String alt;
    private String lon;
    private String detectedAmount;
    private Integer fishId;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
