package org.mdt.aioceaneye.dto.material;

import java.time.LocalDateTime;

public record MaterialLogDto(
        LocalDateTime materialAt,
        String materialSerialNo,
        String droneID,
        int repairCount,
        String docNo,
        double estimatedRestTime,
        double useTime,
        double restTime
) {
}
