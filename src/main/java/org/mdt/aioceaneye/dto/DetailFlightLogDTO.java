package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class DetailFlightLogDTO {
private Timestamp flight_at;
private long drone_id;
private Integer flight_count;
private long ship_id;
private Integer detail_no;
private long flightstep_id;
private String pilot_no1;
private String pilot_no2;
private Text flight_content;
private Text remark;
private String flightlogfile_path;
private Text related_path;
private Timestamp created_at;
private String created_user;
private Timestamp modified_at;
private String modified_user;
}
