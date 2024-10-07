package org.example.services;

import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductConverterService {

    public static ProductResponseDTO toProductResponseDTO(Product product){
        return ProductResponseDTO
                .builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }


    public static Product toProduct(ProductRequestDTO productRequestDTO) {
        Product product = new Product();
        product.setName(productRequestDTO.getName());
        product.setPrice(productRequestDTO.getPrice());
        product.setDescription(productRequestDTO.getDescription());

        return product;
    }
}
