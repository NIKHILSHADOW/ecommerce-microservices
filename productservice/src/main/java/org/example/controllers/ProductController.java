package org.example.controllers;


import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductRequestDTO;
import org.example.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @PostMapping("/")
    public void addProduct(@RequestBody ProductRequestDTO productRequestDTO){
        // to be impl
    }

    @PutMapping("/")
    public void updateProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        // to be impl
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Integer id) {
        // to be impl
    }

    @GetMapping("/{id}")
    public void getProductById(@PathVariable("id") Integer id) {
        // to be impl

    }

    @GetMapping
    public void getProducts() {
        // to be impl
    }

}
