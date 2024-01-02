package com.pharma.PharmaConnect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.PharmaConnect.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
