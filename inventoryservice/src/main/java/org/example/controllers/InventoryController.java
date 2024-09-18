package org.example.controllers;

import org.example.dtos.ProductInsertDTO;
import org.example.dtos.ProductRequestDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/inventory")
public class InventoryController {

    @PostMapping("/")
    public void addProcuctToInventoryIfNotPresent(@RequestBody ProductInsertDTO productInsertDTO){
        // to be implemented
        return ;
    }

    @PutMapping("/")
    public void updateProductToInventory(@RequestBody ProductInsertDTO productInsertDTO){

        // to be impl
        return ;
    }


}
