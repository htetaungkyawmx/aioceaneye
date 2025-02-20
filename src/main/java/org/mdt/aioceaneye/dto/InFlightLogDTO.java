package org.mdt.aioceaneye.dto;

import java.sql.Timestamp;

public class InFlightLogDTO {
    private Timestamp flight_at;
    private long drone_id;
    private Integer flight_count;
    private String ship_id;
    private Integer flightstep_id;
    private String pilot_n01;
    private String pilot_n02;
    private String alt;
    private String lon;
    private String detected_amount;
    private String fish_id;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;
}
