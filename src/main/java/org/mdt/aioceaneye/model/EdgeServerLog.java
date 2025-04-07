package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.dto.EdgeServerLogKey;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(EdgeServerLogKey.class)
public class EdgeServerLog {

    @Id
    private Timestamp coneectAt;

    @Id
    private String edgeserverIp;

    private String connectedStatus;
    private Timestamp createdAt;
    private String createdUser;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
