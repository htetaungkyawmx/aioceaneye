package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.model.MaterialItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicsRepo extends JpaRepository<MaterialItems, Long> {
//    @Query("""select new org.mdt.aioceaneye.dto.ship.ShipInfo(''
//            """)
}
