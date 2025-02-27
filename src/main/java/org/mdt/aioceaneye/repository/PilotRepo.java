package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.pilot.PilotDetailInfo;
import org.mdt.aioceaneye.dto.pilot.PilotInfo;
import org.mdt.aioceaneye.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PilotRepo extends JpaRepository<Pilot, String> {

    @Query("""
    select new org.mdt.aioceaneye.dto.pilot.PilotInfo(p.pilotId, p.pilotName, p.pilotCerNo, p.pilotImg, w.flightNo, w.flightTimes) 
    from Pilot p join PilotWorking w on w.pilotId =  p.pilotId
""")
    List<PilotInfo> getAllPilotInfos();

    @Query("""
    select new org.mdt.aioceaneye.dto.pilot.PilotDetailInfo(p.pilotId, p.pilotName, p.pilotCerNo, p.pilotImg, w.flightNo, w.flightTimes, w.flightDistance,w.flightDay, w.fishingAmount) 
    from Pilot p join PilotWorking w on p.pilotId = w.pilotId
""")
    PilotDetailInfo getPilotDetailInfoById(String id);
}
