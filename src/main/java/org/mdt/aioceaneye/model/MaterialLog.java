package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.dto.MaterialLogKey;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(MaterialLogKey.class)
public class MaterialLog {

    @Id
    private Timestamp materialAt;

    @Id
    private String materialSerialno;

    private Integer droneId;
    private Integer materialRepaircount;
    private String docNo;
    private Double materialUsagetime;
    private Double materialReplacetime;
    private Timestamp materialReleaseat;
    private Timestamp materialReturnat;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
