package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PilotLogDto {
    private String pilotId;
    private Timestamp flightAt;
    private String shipId;
    private String flightCount;
    private String flightTime;
    private String flightDistance;
    private String flightFamount;
    private String flightType;
    private String flightTcount;
    private String flightTtime;
    private String flightTdistance;
    private String flightTday;
    private String flightTfamount;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
