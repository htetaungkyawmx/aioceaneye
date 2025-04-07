package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PilotWorkScheduleDto {
    private String pilotId;
    private PilotStatus pilotStatus;
    private Timestamp startedAt;
    private Timestamp endedAt;
    private String emergencyPhone;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}

