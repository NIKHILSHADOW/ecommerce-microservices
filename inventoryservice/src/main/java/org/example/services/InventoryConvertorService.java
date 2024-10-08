package org.example.services;


import org.example.dtos.InventoryItemResponseDTO;
import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.models.Inventory;
import org.springframework.stereotype.Service;

@Service
public class InventoryConvertorService {

    protected static Inventory toInventory(ProductRequestDTO productRequestDTO){
        Inventory inventory = new Inventory();
        inventory.setProductId(productRequestDTO.getProductId());
        inventory.setQuantity(productRequestDTO.getQuantity());
        return inventory;
    }

    protected static ProductResponseDTO toProductResponseDTO(Inventory inventory){
        return ProductResponseDTO
                .builder()
                .productId(inventory.getProductId())
                .quantity(inventory.getQuantity())
                .build();
    }


}
