package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostFlightLogDto {
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
