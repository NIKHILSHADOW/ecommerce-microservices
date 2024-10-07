package org.example.controllers;


import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @PostMapping("/")
    public ProductResponseDTO addProduct(@RequestBody ProductRequestDTO productRequestDTO){
        // to be impl
        return productService.addProduct(productRequestDTO);
    }

    @PostMapping("/")
    public ProductResponseDTO updateProduct(@RequestBody ProductRequestDTO productRequestDTO, @PathVariable("id") Integer id) {
        // to be impl
        return productService.updateProduct(id, productRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Integer id) {
        // to be impl

        productService.deleteProduct(id);

        return;
    }

    @GetMapping("/{id}")
    public ProductResponseDTO getProductById(@PathVariable("id") Integer id) {
        // to be impl
        return productService.getProductById(id);
    }

    @GetMapping
    public List<ProductResponseDTO> getProducts() {
        // to be impl
        return productService.getAllProducts();
    }

}
