package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialLogDto {
    private Timestamp materialAt;
    private String materialSerialno;
    private Integer droneId;
    private Integer materialRepaircount;
    private String docNo;
    private Double materialUsagetime;
    private Double materialReplacetime;
    private Timestamp materialReleaseat;
    private Timestamp materialReturnat;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
