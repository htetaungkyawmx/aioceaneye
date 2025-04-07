package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuestionDto {
    private Integer questionCode;
    private String subject;
    private String question;
    private String answer;
    private Integer opinion;
    private Timestamp createdAt;
    private String createdUsername;
    private String createdEmail;
    private String answerEmail;
}
