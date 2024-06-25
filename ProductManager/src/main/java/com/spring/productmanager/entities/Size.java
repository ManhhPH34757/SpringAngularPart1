package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sizes")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_size")
    private Long idSize;

    @Column(name = "_size_code")
    private String sizeCode;

    @Column(name = "_size_name")
    private String sizeName;

}
