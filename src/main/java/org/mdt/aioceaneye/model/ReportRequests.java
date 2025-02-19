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
public class ReportRequests extends AbstractEntity {

    @Id
    private String docNo;

    private String docType;

//    private Ships ship;

    private LocalDateTime docAt;

    private Long goodCount;

    @Column(columnDefinition = "TEXT")
    private String goodDetail;

    @Column(columnDefinition = "TEXT")
    private String docEtcContent;

    private String docRelated;

    private String docApprover;

    private String docSignStatus;




}
