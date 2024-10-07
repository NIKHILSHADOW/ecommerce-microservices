package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.dtos.ProductRequestDTO;
import org.example.dtos.ProductResponseDTO;
import org.example.models.Product;
import org.example.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public List<ProductResponseDTO> getAllProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(product -> ProductConverterService.toProductResponseDTO(product))
                .toList();
    }

    public ProductResponseDTO getProductById(Integer id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw new IllegalArgumentException("no product found with given id");
        }

        return ProductConverterService.toProductResponseDTO(product.get());
    }

    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO){
        Product product = productRepository.save(ProductConverterService.toProduct(productRequestDTO));

        return ProductConverterService.toProductResponseDTO(product);
    }

    public void deleteProduct(Integer id){

        productRepository.deleteById(id);

        return;
    }

    public ProductResponseDTO updateProduct(Integer id, ProductRequestDTO productRequestDTO){

        Optional<Product> productInfo = productRepository.findById(id);

        if(productInfo.isEmpty()){
            throw new IllegalArgumentException("product with given id not found");
        }

        Product product = productInfo.get();
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());

        return ProductConverterService.toProductResponseDTO(productRepository.save(product));
    }
}
