package org.mdt.aioceaneye.repository;

import org.mdt.aioceaneye.dto.pilot.PilotWorkingDto;
import org.mdt.aioceaneye.model.PilotWorking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PilotWorkingRepo extends JpaRepository<PilotWorking,String> {

    @Query("""
    select new org.mdt.aioceaneye.dto.pilot.PilotWorkingDto(w.flightNo, w.flightTimes, w.flightDistance, w.flightDay, w.fishingAmount) 
    from PilotWorking w
""")
    PilotWorkingDto findPilotWorkingDtoByPilotId(String pilotId);
}
