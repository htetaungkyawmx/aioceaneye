package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuestDto {

    private int id;
    private String email;
    private String password;

}
