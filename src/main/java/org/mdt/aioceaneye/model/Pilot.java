package org.mdt.aioceaneye.model;


import jakarta.persistence.*;
import lombok.*;
import org.mdt.aioceaneye.model.enums.PilotStatus;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "pilot_t")
public class Pilot extends AbstractEntity {

    @Id
    private String pilotId;

    private String pilotName;

    private String pilotCerNo;

    private String pilotPassport;

    private String pilotEmail;

    private String pilotPhone;

    private String pilotCountry;

    private String pilotGrade;

    private String pilotImg;

    private PilotStatus pilotStatus;

    @OneToOne(mappedBy = "pilot")
    private PilotWorking pilotWorking;

}
