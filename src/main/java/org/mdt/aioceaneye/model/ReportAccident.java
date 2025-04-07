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
public class ReportAccident {

    @Id
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
