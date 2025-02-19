package org.mdt.aioceaneye.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AbstractEntity {

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdUser;

    @LastModifiedDate
    private LocalDate modifiedAt;

    @LastModifiedBy
    private String modifiedUser;
}
