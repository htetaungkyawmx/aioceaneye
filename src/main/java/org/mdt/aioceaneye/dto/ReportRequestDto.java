package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportRequestDto {
    private String docNo;
    private String docCode;
    private String coId;
    private String docManager;
    private String docRequester;
    private String docContent;
    private Timestamp docAt;
    private String docApprover;
    private String docSignstatus;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
