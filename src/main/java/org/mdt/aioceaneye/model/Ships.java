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
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ship_name;
    private String ship_desc;
    private String ship_captain_name;
    private String ship_1th_name;
    private String ship_2th_name;
    private String ship_3th_name;
    private String ship_captain_email;
    private String ship_1th_email;
    private String ship_2th_email;
    private String ship_3th_email;
    private String ship_callsign;
    private String ship_class;
    private String ship_country;
    private String ship_mmsi;
    private String ship_imono;
    private String ship_office_no;
    private String yield;
    private Date build_year;
    private int co_id;
    private String ship_logo_path;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;

}
