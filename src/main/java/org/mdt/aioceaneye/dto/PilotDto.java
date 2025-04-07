package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PilotDto {
    private String pilotId;
    private String pilotName;
    private String pilotCertno;
    private String pilotPassport;
    private String pilotEmail;
    private String pilotPhone;
    private String pilotCountry;
    private String pilotGrade;
    private String pilotPhotoPath;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}

