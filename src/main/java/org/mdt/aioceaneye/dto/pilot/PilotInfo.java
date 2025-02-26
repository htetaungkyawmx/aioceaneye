package org.mdt.aioceaneye.dto.pilot;

public record PilotInfo(
        String pilotId,
        String pilotName,
        String pilotCerNo,
        String pilotImg,
        String flightNo,
        int flightTimes
) {
}
