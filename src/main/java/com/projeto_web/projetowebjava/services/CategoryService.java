package com.projeto_web.projetowebjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_web.projetowebjava.entities.Category;
import com.projeto_web.projetowebjava.repositories.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(int id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
