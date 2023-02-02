package com.projeto_web.projetowebjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_web.projetowebjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
