package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MechanicDto {
    private String mechanicNo;
    private String mechanicName;
    private String mechanicEmail;
    private String mechanicPosition;
    private String mechanicPhone;
    private String mechanicSign;
    private byte[] mechanicImg; // Accepts base64-decoded or file bytes
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
