package com.example.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.entities.Poduct;
import com.example.projeto.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Poduct> findAll(){
		return repository.findAll();
	}
	
	public Poduct findById(Long id) {
		Optional<Poduct> obj = repository.findById(id);
		return obj.get();
	}

}
