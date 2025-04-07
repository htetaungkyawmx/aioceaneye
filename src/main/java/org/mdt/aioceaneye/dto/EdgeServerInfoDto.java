package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EdgeServerInfoDto {
    private String edgeserverName;
    private String edgeserverIp;
    private Integer edgeserverPort;
    private String edgeserverVersion;
    private String targetIp;
    private String tartgetPort;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
