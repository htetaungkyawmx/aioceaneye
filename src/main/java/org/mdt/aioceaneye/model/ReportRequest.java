package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class ReportRequest {

    @Id
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
