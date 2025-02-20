package org.mdt.aioceaneye.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class ReportDaily extends AbstractEntity{

    @Id
    private String docNo;

    private String docType;

//    private Ships ship;

    private LocalDateTime docAt;

    private String docReason;

    @Column(columnDefinition = "TEXT")
    private String docWork;

    @Column(columnDefinition = "TEXT")
    private String docProblem;

    private String docApprover;

    private String docSignStatus;

    @Column(columnDefinition = "TEXT")
    private String docEtcContent;

    @Column(columnDefinition = "TEXT")
    private String docRelated;

}
