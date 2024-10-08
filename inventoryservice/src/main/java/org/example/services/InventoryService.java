package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.dtos.InventoryItemResponseDTO;
import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.models.Inventory;
import org.example.repositories.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public ProductResponseDTO addProductToInventoryIfNotPresent(ProductRequestDTO productRequestDTO){
        Optional<Inventory> inventoryInfo = inventoryRepository.findByProductId(productRequestDTO.getProductId());

        Inventory inventory;

        if(inventoryInfo.isEmpty()){
            inventory = inventoryRepository.save(InventoryConvertorService.toInventory(productRequestDTO));
        }else{
            inventoryInfo.get().setQuantity(inventoryInfo.get().getQuantity() + productRequestDTO.getQuantity());

            inventory = inventoryRepository.save(inventoryInfo.get());
        }

        return InventoryConvertorService.toProductResponseDTO(inventory);
    }

    public ProductResponseDTO updateInventory(ProductRequestDTO productRequestDTO){
        Optional<Inventory> inventoryInfo = inventoryRepository.findByProductId(productRequestDTO.getProductId());

        if(inventoryInfo.isEmpty()){
            throw new IllegalArgumentException("No product available with given id\n");
        }

        if(inventoryInfo.get().getQuantity() < productRequestDTO.getQuantity()){
            throw new IllegalArgumentException("out of stock\n");
        }

       inventoryInfo.get().setQuantity(inventoryInfo.get().getQuantity() - productRequestDTO.getQuantity());

        Inventory inventory = inventoryRepository.save(inventoryInfo.get());
        return InventoryConvertorService.toProductResponseDTO(inventory);
    }

    public boolean isInStock(ProductRequestDTO productRequestDTO){
        Optional<Inventory> inventoryInfo =  inventoryRepository.findByProductId(productRequestDTO.getProductId());

        if(inventoryInfo.isEmpty()){
            throw new IllegalArgumentException("no product present with given product id");
        }

        return inventoryInfo.get().getQuantity() > 0 ;
    }
}
