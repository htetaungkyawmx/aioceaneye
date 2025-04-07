package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportAccidentDto {
    private String docNo;
    private String docCode;
    private Integer droneId;
    private String docType;
    private String docAction;
    private String docCause;
    private String docContent;
    private String docApprover;
    private String docSignstatus;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
