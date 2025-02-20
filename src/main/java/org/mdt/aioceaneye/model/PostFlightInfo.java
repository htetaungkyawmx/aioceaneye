package org.mdt.aioceaneye.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostFlightInfo {

    private Integer contentNo;

    private String content;

    private Text remark;
}
