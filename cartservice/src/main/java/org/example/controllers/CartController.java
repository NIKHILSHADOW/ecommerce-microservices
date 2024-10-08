package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dtos.CartRequestDTO;
import org.example.services.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/")
    public void createCart(@RequestBody CartRequestDTO cartRequestDTO){
        // to be implemented


    }

    @DeleteMapping("/{id")
    public void deleteCart(@PathVariable("id") Integer cartId){
        // to be implemented
    }

    @PatchMapping("/{id}")
    public void updateCart(@PathVariable("id") CartRequestDTO cartRequestDTO){
        // to be implemented
    }

    @GetMapping("/{id}")
    public void getCart(@PathVariable("id") Integer userId){
        // to be implemented
    }

}
