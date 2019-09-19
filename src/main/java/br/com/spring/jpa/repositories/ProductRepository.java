package br.com.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.jpa.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
