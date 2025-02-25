package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Materials extends AbstractEntity {

    @Id
    private String materialSerialNo;

    private String materialItem;

    private String materialModel;

    private String materialCo;

    private String materialStorage;

    private LocalDateTime materialEnterAt;

    private String materialLifeTime;

    private String materialUsageTime;

    private String materialReplaceTime;

    private LocalDateTime materialReleaseAt;

    private LocalDateTime materialReturnAt;

}
