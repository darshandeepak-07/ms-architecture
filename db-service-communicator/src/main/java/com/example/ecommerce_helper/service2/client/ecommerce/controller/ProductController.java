package com.example.ecommerce_helper.service2.client.ecommerce.controller;

import com.example.ecommerce_helper.service2.client.ecommerce.request.ProductRequest;
import com.example.ecommerce_helper.service2.client.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-2")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping(value = "/create-product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postProduct(@RequestBody ProductRequest request) {
        return productService.postProduct(request);
    }
}
