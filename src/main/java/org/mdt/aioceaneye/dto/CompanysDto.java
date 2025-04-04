package org.mdt.aioceaneye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanysDto {
    private int id;
    private String co_name;
    private String co_ceoname;
    private String co_registerno;
    private String co_tel;
    private String co_fax;
    private String co_address;
    private String co_username;
    private String co_useremail;
    private String co_userphone;
    private String co_logo;
    private String co_registerfile;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;

}
