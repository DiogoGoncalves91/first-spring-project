package com.dgprojects.project.repositories;

import com.dgprojects.project.entities.OrderItem;
import com.dgprojects.project.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
