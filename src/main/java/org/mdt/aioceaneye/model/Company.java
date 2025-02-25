package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "Company_t")
public class Company extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coId;
    private String coName;
    private String coCeoName;
    private String coRegisterNo;
    private String coTel;
    private String coFax;
    private String coAddress;
    private String coUserName;
    private String coUserEmail;
    private String coUserPhone;
    private String coCountry;
    private String coLogo;
    private String coRegisterFile;
    private Date established_year;

    public void addShip(Ship ship) {
    }
}
