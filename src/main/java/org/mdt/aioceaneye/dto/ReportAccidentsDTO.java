package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class ReportAccidentsDTO {
    private String doc_n0;
    private String doc_type;
    private long ship_id;
    private Timestamp doc_at;
    private Integer good_count;
    private Text good_detail;
    private Text doc_etccontent;
    private String doc_related;
    private String doc_approver;
    private String doc_singstatus;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;
}

