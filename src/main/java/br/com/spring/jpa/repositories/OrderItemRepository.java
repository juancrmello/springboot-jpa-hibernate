package br.com.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.jpa.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
