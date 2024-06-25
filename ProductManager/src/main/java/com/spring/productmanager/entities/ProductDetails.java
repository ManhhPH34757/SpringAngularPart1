package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_product_details")
    private Long idProductDetails;

    @ManyToOne
    @JoinColumn(name = "_id_product")
    private Product idProduct;

    @ManyToOne
    @JoinColumn(name = "_id_color")
    private Color idColor;

    @ManyToOne
    @JoinColumn(name = "_id_size")
    private Size idSize;

    @ManyToOne
    @JoinColumn(name = "_id_sale")
    private Sale idSale;

    @Column(name = "_price_old")
    private BigDecimal priceOld;

    @Column(name = "_price_new")
    private BigDecimal priceNew;

    @Column(name = "_quantity")
    private Integer quantity;

    @Column(name = "_status")
    private String status;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_date_updated")
    private Instant dateUpdated;
}
