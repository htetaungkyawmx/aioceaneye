package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLogDto {
    private String userEmail;
    private String connectedIp;
    private Timestamp connectAt;
    private Timestamp closeAt;
}

