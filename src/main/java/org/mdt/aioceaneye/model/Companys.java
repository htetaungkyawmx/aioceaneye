package org.mdt.aioceaneye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Companys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
