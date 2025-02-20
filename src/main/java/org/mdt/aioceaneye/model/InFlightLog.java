package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class InFlightLog extends AbstractEntity {

    private LocalDateTime flightAt;

    private Drones drones;

    private Integer flightCount;

    private Ships ships;

    private FlightStepInfo flightStepInfo;

    private Pilots pilotNo1;

    private Pilots getPilotNo2;

    private String alt;

    private String lon;

    private String detectedAmount;

    private FishInfo fishInfo;

}
