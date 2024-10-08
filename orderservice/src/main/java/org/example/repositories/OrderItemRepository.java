package org.example.repositories;

import org.example.dtos.OrderItemPrimaryKey;
import org.example.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPrimaryKey> {
}
