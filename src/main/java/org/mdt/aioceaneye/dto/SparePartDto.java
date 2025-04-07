package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SparePartDto {
    private Integer sparePartsCode;
    private String materialSerialno;
    private String materialItem;
}
