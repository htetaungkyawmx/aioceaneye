//package org.mdt.aioceaneye.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class WorkTransfer extends AbstractEntity {
//
//    @Id
//    private String docNo;
//
//    @Column(nullable = false)
//    private String docType;
//
//    private LocalDateTime docAt;
//
////    private Ships ship;
//
////    private Drones drone1;
//
////    private Drones drone2;
//
////    private Mechanics mechanic;
//
//    private LocalDateTime startAt;
//
//    private LocalDateTime endAt;
//
////    private Pilots pilot1;
//
////    private Pilots pilot2;
//
//    @Column(columnDefinition = "TEXT")
//    private String workContent;
//
//    @Column(columnDefinition = "TEXT")
//    private String workingContent;
//
//    @Column(columnDefinition = "TEXT")
//    private String scheduleWork;
//
//    @Column(columnDefinition = "TEXT")
//    private String textContent;
//
//    @Column(columnDefinition = "TEXT")
//    private String actionInfo;
//
//    @Column(columnDefinition = "TEXT")
//    private String specialNoteInfo;
//
//    @Column(columnDefinition = "TEXT")
//    private String docEtcContent;
//
//    private String docApprover;
//
//    private String docSignStatus;
//
//
//}
