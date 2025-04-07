package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneDto {
    private String modelNo;
    private String manageNo;
    private String manufactureNo;
    private Timestamp manufactureAt;
    private String certificationNo;
    private String versionNo;
    private String manufactureUser;
    private String droneImgPath;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
