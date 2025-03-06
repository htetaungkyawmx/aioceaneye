package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.material.MaterialDetailsInfo;
import org.mdt.aioceaneye.dto.material.MaterialInfo;
import org.mdt.aioceaneye.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialRepo extends JpaRepository<Material,String> {

    @Query("""
    select new org.mdt.aioceaneye.dto.material.MaterialInfo(m.materialImg, m.model, m.serialNumber, m.manufacturer, m.useStatus, m.stockDate, m.lifetime, m.usageTime) from Material m
""")
    List<MaterialInfo> getAllMaterialInfos();

    MaterialDetailsInfo getMaterialDetailsInfoBySerialNumber(String serialNumber);

    @Query("""
    select new org.mdt.aioceaneye.dto.material.MaterialInfo(m.materialImg, m.model, m.serialNumber, m.manufacturer, m.useStatus, m.stockDate, m.lifetime, m.usageTime) from Material m
    where m.type.typeName = :materialType and m.useStatus = false
""")
    List<MaterialInfo> getUnusedMaterialInfosByMaterialType(String materialType);
}
