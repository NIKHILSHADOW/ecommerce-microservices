package org.example.models;

import jakarta.persistence.*;
import org.example.dtos.OrderItemPrimaryKey;
import org.hibernate.annotations.Fetch;

@Entity
@Table(name = "orderItems")
@IdClass(OrderItemPrimaryKey.class)
public class OrderItem {

    @Id
    private Integer productId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    private Order orderId;

    private Integer quantity;
}
