package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class WorkSchedulesDTO {
    private String worked_code;
    private String pilot_no1;
    private String pilot_no2;
    private long co_id;
    private long ship_id;
    private Integer drone_id1;
    private Integer drone_id2;
    private Timestamp start_at;
    private Timestamp end_at;
    private Text spare_content;
    private String created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;
}
