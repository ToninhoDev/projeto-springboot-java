package com.example.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
