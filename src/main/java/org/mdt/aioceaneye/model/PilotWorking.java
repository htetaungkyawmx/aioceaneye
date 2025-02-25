package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;
import org.mdt.aioceaneye.model.enums.PilotStatus;
import org.mdt.aioceaneye.model.enums.PilotType;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "pilot_working_t")
public class PilotWorking extends AbstractEntity {

    @Id
    private String pilotId;

    @MapsId
    @OneToOne
    private Pilot pilot;

    @Enumerated(EnumType.STRING)
    private PilotStatus pilotStatus;

    private LocalDate startedAt;

    private LocalDate endedAt;

    private String flightNo;

    private int flightTimes;

    private double flightDistance;

    private int flightDay;

    private double fishingAmount;

    @Enumerated(EnumType.STRING)
    private PilotType pilotType;
}
