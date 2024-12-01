package com.example.ecommerce_helper.service2.client.ecommerce.service;

import com.example.ecommerce_helper.service2.client.ecommerce.EcommerceClient;
import com.example.ecommerce_helper.service2.client.ecommerce.request.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final EcommerceClient client;

    public ResponseEntity<String> postProduct(ProductRequest request) {
        ResponseEntity<String> response = client.createProduct(request);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response;
        } else {
            throw new RuntimeException("Failed to create product, status: " + response.getStatusCode());
        }
    }
}