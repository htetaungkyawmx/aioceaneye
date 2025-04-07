package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManualDto {
    private String manualName;
    private String manualPath;
    private String manualUsed;
    private Timestamp createdAt;
    private String createdUsername;
}
