package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.dtos.InventoryItemResponseDTO;
import org.example.dtos.ProductInsertDTO;
import org.example.repositories.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryItemResponseDTO addProductToInventoryIfNotPresent(ProductInsertDTO productInsertDTO){

    }
}
