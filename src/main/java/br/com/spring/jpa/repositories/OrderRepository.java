package br.com.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.jpa.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
