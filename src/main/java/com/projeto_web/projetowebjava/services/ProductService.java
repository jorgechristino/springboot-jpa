package com.projeto_web.projetowebjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_web.projetowebjava.entities.Product;
import com.projeto_web.projetowebjava.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(int id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
