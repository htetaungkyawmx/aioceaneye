package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;
import org.mdt.aioceaneye.model.enums.MechanicPosition;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "mechanics_t")
public class Mechanic extends AbstractEntity {

    @Id
    private String mechanicId;

    private String mechanicName;

    private String mechanicEmail;

    @Enumerated(EnumType.STRING)
    private MechanicPosition mechanicPosition;

    private String mechanicPhone;

    private String mechanicImg;

    private String mechanicSign;

}
