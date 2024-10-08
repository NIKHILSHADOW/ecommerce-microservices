package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductRequestDTO;
import org.example.services.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/inventory/update")
@RequiredArgsConstructor
public class InventoryStateController {

    private final InventoryService inventoryService;

    @GetMapping("/")
    public Boolean isInStock(@RequestBody ProductRequestDTO productRequestDTO){
        // to be implemented
        return inventoryService.isInStock(productRequestDTO);
    }

    @PutMapping("/")
    public Boolean updateInventory(@RequestBody ProductRequestDTO productRequestDTO){
        // to be impl
        return null;
    }
}
