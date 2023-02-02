package com.projeto_web.projetowebjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_web.projetowebjava.entities.Order;
import com.projeto_web.projetowebjava.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(int id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
