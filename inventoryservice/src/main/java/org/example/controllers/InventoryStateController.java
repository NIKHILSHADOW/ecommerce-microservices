package org.example.controllers;

import org.example.dtos.ProductRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/inventory/update")
public class InventoryStateController {

    @GetMapping("/")
    public Boolean isInStock(@RequestBody ProductRequestDTO productRequestDTO){
        // to be implemented
        return null;
    }

    @PutMapping("/")
    public Boolean updateInventory(@RequestBody ProductRequestDTO productRequestDTO){
        // to be impl
        return null;
    }
}
