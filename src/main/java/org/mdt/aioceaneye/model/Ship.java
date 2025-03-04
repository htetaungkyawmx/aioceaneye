package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "ships_t")
public class Ship extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shipId;
    private String shipName;
    private String shipCallSign;
    private String shipCountry;
    private String shipOfficeNo;
    private String shipImono;
    private String shipAddress;
    private String shipMmsi;
    private String shipPhone;
    private String shipEmail;
    private Double yield;
    private LocalDate buildYear;
    private String shipLogo;
    private String shipCaptainName;
    private String ship1thName;
    private String ship2thName;
    private String ship3thName;
    private String shipCaptainEmail;
    private String ship1thEmail;
    private String ship2thEmail;
    private String ship3thEmail;

    @ManyToOne
    private Company company;

    public void setCompany(Company company) {
        this.company = company;
        company.addShip(this);
    }

}
