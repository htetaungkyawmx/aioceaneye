package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mdt.aioceaneye.dto.UserStatus;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userEmail;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userPassword;

    private Integer gradeCode;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private Integer checkedEmail;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private String modifiedUser;
}

