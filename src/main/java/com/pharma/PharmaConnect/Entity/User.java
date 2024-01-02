package com.pharma.PharmaConnect.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String email;
    private String phone_no;
    private String license_no;
    private String password;
    
    public String getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
    
    public String getLicense_no() {
        return license_no;
    }
    public void setLicense_no(String license_no) {
        this.license_no = license_no;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public User(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public User(){

    }
}
