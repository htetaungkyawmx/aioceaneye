package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Companys extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coId;

    private String coName;

    private String coCeoName;

    private String coRegisterNo;

    private String coTel;

    private String coFax;

    private String coAddress;

    private String coUserName;

    private String coUserEmail;

    private String coUserPhone;

    private Blob coLogo;

    private Blob coRegisterFile;

    private LocalDateTime createdAt;

    private String createdUser;

    private LocalDateTime updatedAt;

    private String updatedUser;


}
