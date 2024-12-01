package com.darshan.ecommerce.controller;

import com.darshan.ecommerce.model.Product;
import com.darshan.ecommerce.request.AddProductRequest;
import com.darshan.ecommerce.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<String> addProduct(@RequestBody AddProductRequest productRequest) {
        System.out.println(productRequest.getName() + productRequest);
        Product response = productService.addProduct(productRequest);
        return ResponseEntity.ok("Product Added Successfully");
    }
}
