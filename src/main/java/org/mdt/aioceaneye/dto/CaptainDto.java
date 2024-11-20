package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptainDto {

    private int id;
    private String email;
    private String password;

}
