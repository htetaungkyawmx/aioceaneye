package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkTransferDto {
    private String docNo;
    private String docCode;
    private String pilotNo;
    private String docMission;
    private String docContent;
    private String docWork;
    private String docMemo;
    private String docApprover;
    private String docSignstatus;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
