package org.mdt.aioceaneye.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkSchedules extends AbstractEntity {

    @Id
    private String workedCode;

//    private Pilots pilot1;

//    private Pilots pilot2;

//    private Companys company;

//    private Ships ship;

//    private Drones drone1;

//    private Drones drone2;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

    @Column(columnDefinition = "TEXT")
    private String spareContent;


}
