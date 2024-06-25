package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_sale")
    private Long idSale;

    @Column(name = "_sale_code")
    private String saleCode;

    @Column(name = "_percent")
    private Float percent;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_deadline")
    private Instant deadline;
}
