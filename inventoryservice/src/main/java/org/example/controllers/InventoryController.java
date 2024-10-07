package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductInsertDTO;
import org.example.dtos.ProductRequestDTO;
import org.example.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/")
    public void addProductToInventoryIfNotPresent(@RequestBody ProductInsertDTO productInsertDTO){
        // to be implemented

        return ;
    }

    @PutMapping("/")
    public void updateProductToInventory(@RequestBody ProductInsertDTO productInsertDTO){

        // to be impl
        return ;
    }


}
