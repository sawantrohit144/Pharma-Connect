package com.pharma.PharmaConnect.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.PharmaConnect.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
    public User findByEmail(String email);

    // public User save(User user);
}
