package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
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
}
