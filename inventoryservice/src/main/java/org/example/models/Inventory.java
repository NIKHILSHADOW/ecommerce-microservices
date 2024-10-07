package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.util.Introspection;

@Entity
@Table(name = "inventory")
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private Integer productId;

    private Integer quantity;

    public static Inventory inventory(Integer productId, Integer quantity){
        Inventory inventory = new Inventory();
        inventory.productId = productId;
        inventory.quantity = quantity;

        return inventory;
    }
}
