package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userEmail;
    private String userName;
    private String userPassword;
    private Integer gradeCode;
    private UserStatus status;
    private Integer checkedEmail;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private String modifiedUser;
}
