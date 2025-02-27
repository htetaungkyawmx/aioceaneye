package org.mdt.aioceaneye.dto.material;

import org.mdt.aioceaneye.model.Material;

import java.util.Date;

public record MaterialDetailsInfo(
        String materialImg,
        String model,
        String manufacturer,
        String materialStorageArea,
        String buyPlace,
        String serialNumber,
        Date stockDate,
        String lifetime,
        String usageTime,
        String useNo,
        String replaceTime
) {

    public static  MaterialDetailsInfo toDto(Material material) {
        return new MaterialDetailsInfo(
                material.getMaterialImg(),
                material.getModel(),
                material.getManufacturer(),
                material.getMaterialStorageArea(),
                material.getBuyPlace(),
                material.getSerialNumber(),
                material.getStockDate(),
                material.getLifetime(),
                material.getUsageTime(),
                material.getUseNo(),
                material.getReplaceTime()
        );
    }
}
