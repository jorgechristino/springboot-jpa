package com.projeto_web.projetowebjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_web.projetowebjava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{
    
}
