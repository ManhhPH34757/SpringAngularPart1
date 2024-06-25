package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_category")
    private Long idCategory;

    @Column(name = "_category_code")
    private String categoryCode;

    @Column(name = "_category_name")
    private String categoryName;

    @Column(name = "_description")
    private String description;
}
