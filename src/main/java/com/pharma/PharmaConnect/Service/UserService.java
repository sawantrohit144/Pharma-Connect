package com.pharma.PharmaConnect.Service;

import java.util.List;

import com.pharma.PharmaConnect.Entity.Admin;
import com.pharma.PharmaConnect.Entity.Product;
import com.pharma.PharmaConnect.Entity.User;

import jakarta.transaction.Transactional;

public interface UserService {
    public User findByEmail(String email);
    public User saveUser(User user);
    public Admin findByUsername(String username);
    public List<Product> getAllProducts();
    @Transactional
    public Product saveProduct(Product product);
    public void deleteProduct(Long id);
    public Product getProductById(Long id);
    public void updateProduct(Product product);
}
