package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class MaterialLogs extends AbstractEntity {

    private LocalDateTime materialAt;

    private String materialSerialNo;

    private String materialRepairAccount;

    private String docNo;

}
