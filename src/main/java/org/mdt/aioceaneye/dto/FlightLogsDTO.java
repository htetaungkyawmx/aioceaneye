package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class FlightLogsDTO {
    private Timestamp receive_at;
    private String client_ip;
    private long drone_id;
    private String lat;
    private String lon;
    private String alt;
    private String  dist_traveled;
    private String wp_dist;
    private String dist_to_home;
    private String vertical_speed;
    private String wind_vel;
    private String airspeed;
    private String groundspeed;
    private String roll;
    private String pitch;
    private String yaw;
    private String toh;
    private String time_in_air;
    private String time_in_air_min_sec;
    private String gps_hdop;
    private String battery_voltage;
    private String battery_current;
    private String ch3percent;
    private String ch3out;
    private String ch9out;
    private String ch10out;
    private String ch11out;
    private String ch12out;
    private Text waypoint;
    private String ship_id;
    private String pilot_inid;
    private String outid;
    private Timestamp created_at;

}
