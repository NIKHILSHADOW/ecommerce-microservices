package org.example.services;


import org.example.dtos.InventoryItemResponseDTO;
import org.example.dtos.ProductInsertDTO;
import org.example.models.Inventory;
import org.springframework.stereotype.Service;

@Service
public class InventoryConvertorService {

    protected Inventory toInventory(ProductInsertDTO productInsertDTO){
        return Inventory.inventory(productInsertDTO.getProductId(), productInsertDTO.getQuantity());
    }

    protected InventoryItemResponseDTO toInventoryItemResponseDTO(Inventory inventory){

    }
}
