package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Ship extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipId;

    private String shipName;

    private String shipDescription;

    private String shipCaptain;

    private String ship1th;

    private String ship2th;

    private String ship3th;

    private String shipCallSign;

    private String shipClass;

    private String shipCountry;

    private String shipMmsi;

    private String shipImono;

    private String shipOfficeNo;

    private Double yield;

    private Date buildYear;

    private String shipLogo;

    private String shipPhone;

    private String shipEmail;

//    private Companys company;



}
