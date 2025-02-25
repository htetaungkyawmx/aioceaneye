//package org.mdt.aioceaneye.model;
//
//
//import jakarta.persistence.*;
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
//public class Users extends AbstractEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 255, unique = true)
//    private String userEmail;
//
//    @Column(nullable = false, length = 255, unique = true)
//    private String userName;
//
//    @Column(nullable = false, length = 100)
//    private String password;
//
//    @Column(nullable = false)
//    private String userGrade;
//
//    private Integer checkedEmail;
//
//
//}
