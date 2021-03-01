package com.webservice.course.repositories;

import com.webservice.course.entities.OrderItem;
import com.webservice.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> { }
