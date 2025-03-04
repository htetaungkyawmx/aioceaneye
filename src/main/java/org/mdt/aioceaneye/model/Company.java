package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "companies_t")
public class Company extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coId;
    private String coName;
    private String coCeoName;
    private String coRegisterNo;
    private String coTel;
    private String coFax;
    private String coAddress;
    private String coHomePage;
    private String coUserEmail;
    private String coUserPhone;
    private String coCountry;
    private String coLogo;
    private Integer coEmployees;
    private String coRegisterFile;
    private Date established_year;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Ship> ships;

    public void addShip(Ship ship) {
        this.ships.add(ship);
    }
}
