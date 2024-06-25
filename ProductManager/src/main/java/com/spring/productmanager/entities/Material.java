package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_material")
    private Long idMaterial;

    @Column(name = "_material_code")
    private String materialCode;

    @Column(name = "_material_name")
    private String materialName;
}
