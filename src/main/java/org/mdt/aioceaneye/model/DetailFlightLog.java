package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailFlightLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime flightAt;

    private Integer droneId;

    private Integer flightCount;

    private String shipId;

    private Integer detailNo;

    private Integer flightStepId;

    private String pilotNo1;

    private String pilotNo2;

    private String catchArea;

    private String checkedContent;

    private LocalDateTime createdAt;

    private String createdUser;

    private LocalDateTime modifiedAt;

    private String modifiedUser;


}
