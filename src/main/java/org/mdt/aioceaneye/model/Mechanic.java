package org.mdt.aioceaneye.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
public class Mechanic {

    @Id
    private String mechanicNo;

    private String mechanicName;
    private String mechanicEmail;
    private String mechanicPosition;
    private String mechanicPhone;
    private String mechanicSign;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] mechanicImg;

    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
