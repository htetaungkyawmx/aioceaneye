package org.mdt.aioceaneye.dto;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class WorkTransferDTO {
    private String doc_no;
    private String doc_type;
    private Timestamp doc_at;
    private long ship_id;
    private String drone_id1;
    private String drone_id2;
    private String mechanic_no;
    private Timestamp start_at;
    private Timestamp end_at;
    private String pilot_id1;
    private String pilot_id2;
    private Text work_content;
    private Text working_content;
    private Text schadule_work;
    private Text test_content;
    private Text action_info;
    private Text specialnote_info;
    private Text doc_etccontent;
    private String doc_approver;
    private String doc_singstatus;
    private Timestamp created_at;
    private String created_user;
    private Timestamp modified_at;
    private String modified_user;

}

