package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_product")
    private Long idProduct;

    @Column(name = "_product_code")
    private String productCode;

    @Column(name = "_product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "_id_brand")
    private Brand idBrand;

    @ManyToOne
    @JoinColumn(name = "_id_category")
    private Category idCategory;

    @ManyToOne
    @JoinColumn(name = "_id_sole")
    private Sole idSole;

    @ManyToOne
    @JoinColumn(name = "_id_material")
    private Material idMaterial;

    @Column(name = "_image")
    private String images;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_date_updated")
    private Instant dateUpdated;

}
