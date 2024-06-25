package com.spring.productmanager.controllers;

import com.spring.productmanager.entities.Brand;
import com.spring.productmanager.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BrandController {

    private final BrandRepository brandRepository;

    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @GetMapping("/brands")
    public List<Brand> getProducts() {
        return brandRepository.findAll();
    }

}
