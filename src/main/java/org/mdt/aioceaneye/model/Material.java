package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "materials_t")
public class Material extends AbstractEntity {

    @Id
    private String serialNumber;

    private String model;

    private String manufacturer;

    private Date manufactureDate;

    private String materialStorageArea;

    private String buyPlace;

    private Date stockDate;

    private double lifetime;

    private double usageTime;

    private double replaceTime;

    private String useNo;

    private boolean useStatus = false;

    private String materialImg;

    @OneToMany(mappedBy = "material")
    private List<MaterialLog> materialLogs;

    @ManyToOne
    private MaterialType type;

    public void setMaterialType(MaterialType type){
        this.type = type;
        type.addMaterial(this);
    }

}
