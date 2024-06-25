package com.spring.productmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sole")
public class Sole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_sole")
    private Long idSole;

    @Column(name = "_sole_code")
    private String soleCode;

    @Column(name = "_sole_name")
    private String soleName;

}
