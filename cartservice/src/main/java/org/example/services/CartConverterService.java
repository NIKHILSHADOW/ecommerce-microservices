package org.example.services;

import org.example.dtos.CartItemRequestDTO;
import org.example.dtos.CartRequestDTO;
import org.example.models.Cart;
import org.example.models.CartItem;
import org.springframework.stereotype.Service;

@Service
public class CartConverterService {

    private static CartItem toCartItem(CartItemRequestDTO cartItemRequestDTO) {
        CartItem cartItem = new CartItem();
        cartItem.s
    }

    protected static Cart toCart(CartRequestDTO cartRequestDTO){
        Cart cart = new Cart();
        cart.setUserId(cartRequestDTO.getUserId());
        cart.setCartItems(
                cartRequestDTO
                        .getCartItemRequestDTOS()
                        .stream()
                        .map(cartItemRequestDTO -> toCartItem(cartItemRequestDTO))
                        .toList()
        );
    }
}
