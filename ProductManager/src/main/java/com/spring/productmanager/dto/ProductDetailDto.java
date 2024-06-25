package com.spring.productmanager.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDetailDto {
    private Long idProduct;
    private Integer quantity;
    private BigDecimal price;
    private Long idColor;
    private Long idSize;

}
