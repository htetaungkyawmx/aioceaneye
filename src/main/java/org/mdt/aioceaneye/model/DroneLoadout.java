package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.dto.DroneLoadoutKey;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(DroneLoadoutKey.class)
public class DroneLoadout {
    @Id
    private Integer droneId;

    @Id
    private String materialSerialNo;

    private String materialItem;
}

