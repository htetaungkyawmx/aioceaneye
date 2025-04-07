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
public class ReportDaily {

    @Id
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
