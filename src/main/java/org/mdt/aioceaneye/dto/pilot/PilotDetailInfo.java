package org.mdt.aioceaneye.dto.pilot;

public record PilotDetailInfo(
        String pilotId,
        String pilotName,
        String pilotCerNo,
        String pilotImg,
        String flightNo,
        int flightTimes,
        double flightDistance,
        int flightDay,
        double fishingAmount
) {

}
