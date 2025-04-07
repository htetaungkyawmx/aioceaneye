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
public class PilotSLog {
    @Id
    private String pilotId;

    private String groundDays;
    private String groundDaysLeft;
    private String boardDays;
    private String boardDaysLeft;
    private String vacationDays;
    private String vacationDaysLeft;
    private Timestamp updateAt;
}
