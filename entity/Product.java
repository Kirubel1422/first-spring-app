package com.boot.spring_boot_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String stock;

    // Setters and Getters
    @Override
    public String toString(){
        return "{" + '\n' + "id=" + id + '\n' + "productName=" + productName + '\n' + "price=" + price  + '\n' + "stock=" + stock + '\n' + "}";
    };

}
