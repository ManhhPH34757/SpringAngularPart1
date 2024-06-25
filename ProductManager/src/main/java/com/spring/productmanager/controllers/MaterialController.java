package com.spring.productmanager.controllers;

import com.spring.productmanager.entities.Material;
import com.spring.productmanager.repositories.MaterialRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MaterialController {

    private final MaterialRepository materialRepository;

    public MaterialController(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @GetMapping("/materials")
    public List<Material> getProducts() {
        return materialRepository.findAll();
    }

}
