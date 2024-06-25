package com.spring.productmanager.controllers;

import com.spring.productmanager.dto.ProductDetailDto;
import com.spring.productmanager.entities.Color;
import com.spring.productmanager.entities.Size;
import com.spring.productmanager.repositories.ColorRepository;
import com.spring.productmanager.repositories.ProductDetailsRepository;
import com.spring.productmanager.repositories.ProductRepository;
import com.spring.productmanager.repositories.SizeRepository;
import com.spring.productmanager.services.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductDetailController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private ProductDetailsService productDetailsService;

    @ModelAttribute("colors")
    public List<Color> getColorList() {
        return colorRepository.findAll();
    }

    @ModelAttribute("sizes")
    public List<Size> getSizeList() {
        return sizeRepository.findAll();
    }

    @GetMapping("/details/{idProduct}")
    public String getProductDetails(
            @PathVariable("idProduct") Long idProduct,
            Model model
    ) {
        model.addAttribute("idProduced", idProduct);
        model.addAttribute("listProductDetails", productDetailsRepository.findProductDetailsByIdProduct(productRepository.findById(idProduct).get()));
        model.addAttribute("productDto", productRepository.findById(idProduct).get());
        return "/productDetails/index";
    }

    @ResponseBody
    @PostMapping("/create-details/{idProduct}")
    public ResponseEntity<String> createProductDetails(@PathVariable Long idProduct, @RequestBody List<ProductDetailDto> productDetails) {
        try {
            productDetailsService.saveProductDetails(idProduct, productDetails);
            return ResponseEntity.ok("Products saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error saving products: " + e.getMessage());
        }
    }

    @GetMapping("/delete-details/{idProduct}/{idProductDetails}")
    public String deleteProductDetails(@PathVariable("idProduct") Long idProduct, @PathVariable Long idProductDetails) {
        productDetailsRepository.deleteById(idProductDetails);
        return "redirect:/products/details/" + idProduct;
    }

}
