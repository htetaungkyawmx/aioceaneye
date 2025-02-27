package org.mdt.aioceaneye.dto.material;

import org.mdt.aioceaneye.model.Material;

import java.util.Date;

public record MaterialRegisterForm(
        String serialNumber,
        String model,
        String manufacturer,
        Date manufactureDate,
        String materialStorageArea,
        String buyPlace,
        Date stockDate,
        String lifetime,
        String usageTime,
        String useNo,
        String replaceTime,
        String materialImg,
        int typeId
) {

    public static Material toEntity(MaterialRegisterForm form) {
        return Material.builder()
                .serialNumber(form.serialNumber())
                .model(form.model())
                .manufacturer(form.manufacturer())
                .manufactureDate(form.manufactureDate())
                .materialStorageArea(form.materialStorageArea())
                .buyPlace(form.buyPlace())
                .stockDate(form.stockDate())
                .lifetime(form.lifetime())
                .usageTime(form.usageTime())
                .useNo(form.useNo())
                .replaceTime(form.replaceTime())
                .materialImg(form.materialImg())
                .build();
    }
}
