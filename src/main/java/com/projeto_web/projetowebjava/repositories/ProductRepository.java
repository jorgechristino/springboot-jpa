package com.projeto_web.projetowebjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_web.projetowebjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
