package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.MaterialLog;
import org.mdt.aioceaneye.model.MaterialLogPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MaterialLogRepo extends JpaRepository<MaterialLog, MaterialLogPk> {

    @Query("""
    select m from MaterialLog m where m.materialLogPk.serialNumber =  :serialNumber order by m.materialLogPk.materialAt desc limit 1
""")
    MaterialLog findLatestLogBySerialNo(String serialNumber);

    @Query("""
    select count(m) > 0 from MaterialLog m where m.materialLogPk.serialNumber =  :serialNumber
""")
    boolean existsBySerialNumber(String serialNumber);
}
