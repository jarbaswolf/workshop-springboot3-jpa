package com.br.jarbas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.jarbas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
	
	
}
