package org.mdt.aioceaneye.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class MaterialLogPk {

    private LocalDateTime materialAt;

    private String serialNumber;
}
