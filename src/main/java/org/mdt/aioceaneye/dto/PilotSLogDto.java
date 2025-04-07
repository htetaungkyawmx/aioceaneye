package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PilotSLogDto {
    private String pilotId;
    private String groundDays;
    private String groundDaysLeft;
    private String boardDays;
    private String boardDaysLeft;
    private String vacationDays;
    private String vacationDaysLeft;
    private Timestamp updateAt;
}

