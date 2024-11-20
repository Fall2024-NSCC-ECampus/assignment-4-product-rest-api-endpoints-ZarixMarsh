package com.example.assignment3.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private Date deliveryDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // No-argument constructor
    public Delivery() {
    }

    // Parameterized constructor
    public Delivery(String status, Date deliveryDate, Product product) {
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.product = product;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
