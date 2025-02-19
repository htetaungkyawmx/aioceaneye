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
public class ReportRepairs extends AbstractEntity {

    @Id
    private String docNo;

    private String docType;

    private LocalDateTime docAt;

//    private Ships ship;

//    private Drones drone1;

//    private Drones drone2;

    private String mechanicNo;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

    private LocalDateTime accidentAt;

    @Column(columnDefinition = "TEXT")
    private String repairItem;

    @Column(columnDefinition = "TEXT")
    private String repairContent;

    @Column(columnDefinition = "TEXT")
    private String scheduleWork;

    @Column(columnDefinition = "TEXT")
    private String textContent;

    @Column(columnDefinition = "TEXT")
    private String actionInfo;

    @Column(columnDefinition = "TEXT")
    private String specialNoteInfo;

    @Column(columnDefinition = "TEXT")
    private String docEtcContent;

    private String docApprover;

    private String docSignStatus;



}
