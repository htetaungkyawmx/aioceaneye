package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanysDTO {
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
    private byte[] coLogo; // Changed from byte to byte[]
    private byte[] coRegisterFile; // Changed from byte to byte[]
    private Date established_year;
}
