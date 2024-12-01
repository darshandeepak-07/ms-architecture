package com.example.ecommerce_helper.service2.client.ecommerce;

import com.example.ecommerce_helper.service2.client.ecommerce.request.ProductRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ecommerce",url = "http://localhost:8080",path = "/api/product")
public interface EcommerceClient {

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest);
}
