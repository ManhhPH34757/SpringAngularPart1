package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_color")
    private Long idColor;

    @Column(name = "_color_code")
    private String colorCode;

    @Column(name = "_color_name")
    private String colorName;
}
