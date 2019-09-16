package br.com.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.jpa.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
