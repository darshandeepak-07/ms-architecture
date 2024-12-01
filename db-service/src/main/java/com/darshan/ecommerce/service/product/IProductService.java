package com.darshan.ecommerce.service.product;

import com.darshan.ecommerce.model.Product;
import com.darshan.ecommerce.request.AddProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long categoryId);
    Product getProductById(Long id);
    void deleteProduct(Long id);
    void updateProduct(AddProductRequest product,Long productId);
}
