package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailFlightLogDto {
    private String flightlogId;
    private String pilotNo;
    private String mechanicNo;
    private String coId;
    private String gcsId;
    private String datalinkId;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
