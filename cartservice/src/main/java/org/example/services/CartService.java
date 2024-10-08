package org.example.services;


import lombok.RequiredArgsConstructor;
import org.example.dtos.CartRequestDTO;
import org.example.models.Cart;
import org.example.repositories.CartRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public void createCart(CartRequestDTO cartRequestDTO){
        return cartRepository.save(CartConverterService.toCart(cartRequestDTO));
    }

    public void updateCart(CartRequestDTO cartRequestDTO){

    }

    public void deleteCart(Integer id){
        cartRepository.deleteById(id);
        return;
    }

    public void getCart(Integer id){

    }
}
