package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_brand")
    private Long idBrand;

    @Column(name = "_brand_code")
    private String brandCode;

    @Column(name = "_brand_name")
    private String brandName;

    @Column(name = "_description")
    private String description;

}
