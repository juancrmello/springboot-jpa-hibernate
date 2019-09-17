package br.com.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.jpa.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
