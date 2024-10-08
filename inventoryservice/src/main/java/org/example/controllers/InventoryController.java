package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.services.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/")
    public ProductResponseDTO addProductToInventoryIfNotPresent(@RequestBody ProductRequestDTO productRequestDTO){
        // to be implemented

        return inventoryService.addProductToInventoryIfNotPresent(productRequestDTO);
    }

    @PatchMapping("/{id}")
    public ProductResponseDTO updateInventory(@RequestBody ProductRequestDTO productRequestDTO){
        // to be impl

        return inventoryService.updateInventory(productRequestDTO);
    }


}
