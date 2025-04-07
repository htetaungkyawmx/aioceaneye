package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
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
public class Pilot {
    @Id
    private String pilotId;

    @NotNull
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
