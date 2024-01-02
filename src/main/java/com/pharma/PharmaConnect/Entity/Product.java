package com.pharma.PharmaConnect.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private byte[] image;
    public byte[] getImage() {
        return image;
    }


    public void setImage(byte[] image) {
        this.image = image;
    }


    private Double mrp;
    private Double price;
    private Integer qty;
    private String short_desc;
    private String description;
    private String meta_title;
    private String meta_desc;
    private String meta_keyword;

    public Product(Long id, String name, byte[] image, Double mrp, Double price, Integer qty, String short_desc,
            String description, String meta_title, String meta_desc, String meta_keyword) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.mrp = mrp;
        this.price = price;
        this.qty = qty;
        this.short_desc = short_desc;
        this.description = description;
        this.meta_title = meta_title;
        this.meta_desc = meta_desc;
        this.meta_keyword = meta_keyword;
    }


    public String getShort_desc() {
        return short_desc;
    }
    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMeta_title() {
        return meta_title;
    }
    public void setMeta_title(String meta_title) {
        this.meta_title = meta_title;
    }
    public String getMeta_desc() {
        return meta_desc;
    }
    public void setMeta_desc(String meta_desc) {
        this.meta_desc = meta_desc;
    }
    public String getMeta_keyword() {
        return meta_keyword;
    }
    public void setMeta_keyword(String meta_keyword) {
        this.meta_keyword = meta_keyword;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public Double getMrp() {
        return mrp;
    }
    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }
    
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Integer getQty() {
        return qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }


    public Product(){

    }
}
