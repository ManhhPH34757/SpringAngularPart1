package com.spring.productmanager.controllers;

import com.spring.productmanager.entities.Sole;
import com.spring.productmanager.repositories.SoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SoleController {

    private final SoleRepository soleRepository;

    public SoleController(SoleRepository soleRepository) {
        this.soleRepository = soleRepository;
    }

    @GetMapping("/soles")
    public List<Sole> getProducts() {
        return soleRepository.findAll();
    }

}
