package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart-items")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItem {

    @Id
    private Integer productId;

    @ManyToOne
    private Integer cartId;

    private Integer quantity;
}
