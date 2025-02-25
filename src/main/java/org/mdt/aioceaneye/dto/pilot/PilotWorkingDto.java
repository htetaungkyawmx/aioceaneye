package org.mdt.aioceaneye.dto.pilot;

// this is used in Pilot Detail Info and Pilot List Table/ Panel
public record PilotWorkingDto(
        String flightNo,
        int flightTimes,
        double flightDistance,
        int flightDay,
        double fishingAmount
) {
}
