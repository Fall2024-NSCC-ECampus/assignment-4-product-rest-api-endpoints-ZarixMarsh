package com.example.assignment3.controller;

import com.example.assignment3.model.Delivery;
import com.example.assignment3.repository.DeliveryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {
    private final DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    // GET all deliveries
    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    // POST a new delivery
    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    // GET a single delivery by ID
    @GetMapping("/{id}")
    public Delivery getDeliveryById(@PathVariable Long id) {
        return deliveryRepository.findById(id).orElse(null);
    }
}