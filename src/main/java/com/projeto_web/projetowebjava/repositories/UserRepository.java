package com.projeto_web.projetowebjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_web.projetowebjava.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
