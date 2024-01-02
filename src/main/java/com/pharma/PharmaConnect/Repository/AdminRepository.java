package com.pharma.PharmaConnect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.PharmaConnect.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

    public Admin findByUsername(String username);
    
} 
