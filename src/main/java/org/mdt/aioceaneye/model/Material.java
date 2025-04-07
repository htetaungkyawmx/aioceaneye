package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {
    @Id
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
