package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "materiallog_t")
public class MaterialLog extends AbstractEntity {

    @EmbeddedId
    private MaterialLogPk materialLogPk;

    @MapsId("serialNumber")
    @ManyToOne
    private Material material;

    private int repairCount;

//  Will connect to doc later
    private String docNo;

    private int estimateRestTime;

    private int useTime;

    private int materialRestTime;



}
