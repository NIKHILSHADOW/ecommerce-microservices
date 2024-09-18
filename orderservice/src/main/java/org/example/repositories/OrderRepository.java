package org.example.repositories;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
