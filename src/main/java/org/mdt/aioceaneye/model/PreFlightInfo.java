package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PreFlightInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentNo;

    private String content;

    @Column(columnDefinition = "TEXT")
    private String remark;
}
