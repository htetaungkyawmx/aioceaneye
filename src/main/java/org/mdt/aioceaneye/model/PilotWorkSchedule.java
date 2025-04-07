package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.dto.PilotStatus;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PilotWorkSchedule {
    @Id
    private String pilotId;

    @Enumerated(EnumType.STRING)
    private PilotStatus pilotStatus;

    private Timestamp startedAt;
    private Timestamp endedAt;
    private String emergencyPhone;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}

