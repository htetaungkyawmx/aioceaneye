package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class PostFlightLogDTO {
    private Timestamp flight_at;
    private Integer drone_id;
    private Integer flight_count;
    private String ship_id;
    private Integer flightstep_id;
    private String pilot_no1;
    private String pilot_no2;
    private String  catch_area;
    private Text checked_content;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;
}
