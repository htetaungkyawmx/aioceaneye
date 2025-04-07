package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDailyDto {
    private String docNo;
    private String docCode;
    private String shipId;
    private Timestamp docAt;
    private String docReason;
    private String docWork;
    private String docProblem;
    private String docApprover;
    private String docSingstatus;
    private String docEtccontent;
    private String docRelated;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
