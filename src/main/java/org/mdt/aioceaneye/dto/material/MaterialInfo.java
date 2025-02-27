package org.mdt.aioceaneye.dto.material;

import org.mdt.aioceaneye.model.Material;

import java.util.Date;

public record MaterialInfo(
        String materialImg,
        String model,
        String serialNumber,
        String manufacturer,
        boolean useStatus,
        Date stockDate
) {

    public static MaterialInfo toDto(Material material) {
        return new MaterialInfo(
                material.getMaterialImg(),
                material.getModel(),
                material.getSerialNumber(),
                material.getManufacturer(),
                material.isUseStatus(),
                material.getStockDate()
        );
    }
}
