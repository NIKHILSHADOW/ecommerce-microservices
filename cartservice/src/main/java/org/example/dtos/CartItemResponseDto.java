package org.example.dtos;

import lombok.Data;

@Data
public class CartItemResponseDto {

    private Integer productId;

    private Integer quantity;

    private Double price;

    private CartItemResponseDto(){};

    public static CartItemResponseDTOBuilder builder(){
        return new CartItemResponseDTOBuilder();
    }

    public static class CartItemResponseDTOBuilder{

        private Integer productId;

        private Integer quantity;

        private Double price;

        public CartItemResponseDTOBuilder productId(Integer productId){
            this.productId = productId;
            return this;
        }

        public CartItemResponseDTOBuilder quantity(Integer quantity){
            this.quantity = quantity;
            return this;
        }

        public  CartItemResponseDTOBuilder price(Double price){
            this.price = price;
            return this;
        }


        public CartItemResponseDto build(){
            CartItemResponseDto cartItemResponseDto = new CartItemResponseDto();
            cartItemResponseDto.productId = this.productId;
            cartItemResponseDto.quantity = this.quantity;
            cartItemResponseDto.price = this.price;

            return cartItemResponseDto;
        }
    }

}
