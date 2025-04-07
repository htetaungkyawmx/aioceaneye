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
public class WorkSchedule {

    @Id
    private String workedCode;

    private String pilotNo1;
    private String pilotNo2;
    private String coId;
    private String shipId;
    private Integer droneId1;
    private Integer droneId2;
    private String gcsIp;
    private String datalinkIp;
    private Timestamp startAt;
    private Timestamp endAt;
    private Integer sparePartsCode;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
