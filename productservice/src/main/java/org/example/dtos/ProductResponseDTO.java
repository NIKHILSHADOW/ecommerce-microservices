package org.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.models.Product;

@Data
public class ProductResponseDTO {

    private Integer id;

    private String name;

    private String description;

    private Double price;

    private ProductResponseDTO(){}

    public static ProductResponseDTOBuilder builder(){
        return new ProductResponseDTOBuilder();
    }

    public static class ProductResponseDTOBuilder{
        private Integer id;

        private String name;

        private String description;

        private Double price;

        public ProductResponseDTOBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public ProductResponseDTOBuilder name(String name){
            this.name=name;
            return this;
        }

        public ProductResponseDTOBuilder description(String description){
            this.description=description;
            return this;
        }

        public ProductResponseDTOBuilder price(Double price) {
            this.price=price;
            return this;
        }

        public ProductResponseDTO build(){
            if(!isValid()){
                throw new IllegalArgumentException("wrong input of product details\n");
            }

            ProductResponseDTO productResponseDTO = new ProductResponseDTO();
            productResponseDTO.id = this.id;
            productResponseDTO.name=this.name;
            productResponseDTO.description=this.description;
            productResponseDTO.price=this.price;

            return productResponseDTO;
        }

        public boolean isValid(){
            return true;
        }

    }


}
