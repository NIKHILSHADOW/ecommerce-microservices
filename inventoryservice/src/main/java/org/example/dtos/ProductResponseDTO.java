package org.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductResponseDTO {

    private Integer productId;

    private Integer quantity;

    private ProductResponseDTO(){}

    public static ProductResponseDTOBuilder builder(){
        return new ProductResponseDTOBuilder();
    }

    public static class ProductResponseDTOBuilder{
        private Integer productId;

        private Integer quantity;

        public ProductResponseDTOBuilder productId(Integer productId){
            this.productId=productId;
            return this;
        }

        public ProductResponseDTOBuilder quantity(Integer quantity){
            this.quantity=quantity;
            return this;
        }

        public ProductResponseDTO build(){
            ProductResponseDTO productResponseDTO = new ProductResponseDTO();
            productResponseDTO.setProductId(this.productId);
            productResponseDTO.setQuantity(this.quantity);

            return productResponseDTO;
        }

    }

}
