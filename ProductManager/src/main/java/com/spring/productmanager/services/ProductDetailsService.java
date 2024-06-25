package com.spring.productmanager.services;

import com.spring.productmanager.dto.ProductDetailDto;
import com.spring.productmanager.entities.ProductDetails;
import com.spring.productmanager.repositories.ColorRepository;
import com.spring.productmanager.repositories.ProductDetailsRepository;
import com.spring.productmanager.repositories.ProductRepository;
import com.spring.productmanager.repositories.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ProductDetailsService {

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private SizeRepository sizeRepository;

    public void saveProductDetails(Long idProduct, List<ProductDetailDto> productDetails) {
        for (ProductDetailDto detailDto : productDetails) {
            ProductDetails productDetail = new ProductDetails();
            productDetail.setIdProduct(productRepository.findById(idProduct).get());
            productDetail.setIdColor(colorRepository.findById(detailDto.getIdColor()).get());
            productDetail.setIdSize(sizeRepository.findById(detailDto.getIdSize()).get());
            productDetail.setQuantity(detailDto.getQuantity());
            productDetail.setPriceNew(detailDto.getPrice());
            productDetail.setPriceOld(detailDto.getPrice());
            productDetail.setStatus("Available");
            productDetail.setDateCreated(Instant.now());
            productDetail.setDateUpdated(Instant.now());

            productDetailsRepository.save(productDetail);
        }
    }
}
