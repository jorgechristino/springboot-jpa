package com.projeto_web.projetowebjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_web.projetowebjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
