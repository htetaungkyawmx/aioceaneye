package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class ReportRequestsDTO {
    private String doc_no;
    private String doc_type;
    private long ship_id;
    private Timestamp doc_at;
    private Integer good_count;
    private Text good_detail;
    private String doc_approver;
    private String doc_singstatus;
    private Text doc_etccontent;
    private Text doc_related;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;
}
