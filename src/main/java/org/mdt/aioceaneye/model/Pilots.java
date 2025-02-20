package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pilots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pilotName;

    private String pilotCerNo;

    private String pilotPassFort;

    private String pilotEmail;

    private String pilotPhone;

    private String pilotCountry;

    private String pilotStatus;

    private String pilotGrade;

    private LocalDateTime createdAt;

    private String createdUser;

    private LocalDateTime modifiedAt;

    private String modifiedUser;
}
