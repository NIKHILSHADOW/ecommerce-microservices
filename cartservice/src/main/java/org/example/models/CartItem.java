package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import org.example.dtos.CartItemPrimaryKey;

@Entity
@Table(name = "cart-items")
@IdClass(CartItemPrimaryKey.class)
public class CartItem {

    @Id
    private Integer productId;

    @Id
    private Integer cartId;

    private Integer quantity;
}
