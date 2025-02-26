package org.mdt.aioceaneye.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "material_type_t")
public class MaterialType extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    private String typeName;

    @OneToMany(mappedBy = "type")
    private List<Material> materials;

    public void addMaterial(Material m){
        this.materials.add(m);
    }
}
