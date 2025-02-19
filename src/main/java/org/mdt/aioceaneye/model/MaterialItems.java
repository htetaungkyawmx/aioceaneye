package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class MaterialItems extends AbstractEntity {

    private String materialId;

    private String materialItem;

}
