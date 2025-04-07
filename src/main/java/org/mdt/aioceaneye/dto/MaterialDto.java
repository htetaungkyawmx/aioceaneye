package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialDto {
    private String materialSerialno;
    private String materialId;
    private String materialModel;
    private String materialCo;
    private String materialStorage;
    private Timestamp stockDate;
    private Double materialLifetime;
    private Double materialUsagetime;
    private Double materialReplacetime;
    private String materialImgPath;
    private Boolean useStatus;
    private String useNo;
    private String companyOfBuy;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
