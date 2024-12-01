package com.darshan.ecommerce.service.product;

import com.darshan.ecommerce.model.Category;
import com.darshan.ecommerce.model.Image;
import com.darshan.ecommerce.model.Product;
import com.darshan.ecommerce.repository.category.CategoryRepository;
import com.darshan.ecommerce.repository.product.ProductRepository;
import com.darshan.ecommerce.request.AddProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product addProduct(AddProductRequest productRequest) {
        return productRepository.save(createProduct(productRequest));
    }

    private Product createProduct(AddProductRequest productRequest) {
        Product product = new Product();
        if (productRequest.getCategoryId() != null) {
            Category category = categoryRepository.findById(productRequest.getCategoryId()).orElse(
                    createCategory(productRequest.getCategoryName())
            );
            product.setCategory(category);
        } else {
            createCategory(productRequest.getCategoryName());
        }
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setDescription(productRequest.getDescription());
        product.setQuantity(productRequest.getQuantity());

        List<Image> imageList = new ArrayList<>();
        if (productRequest.getImageList() != null) {
            for (Image imageRequest : productRequest.getImageList()) {
                Image image = new Image();
                image.setFileName(imageRequest.getFileName());
                image.setFileType(imageRequest.getFileType());
                image.setImage(imageRequest.getImage());
                image.setDownloadUrl(imageRequest.getDownloadUrl());
                image.setProduct(product);
                imageList.add(image);
            }
        }
        product.setImageList(imageList);
        System.out.println(product.getName() + product.getDescription());
        return product;
    }

    private Category createCategory(String categoryName) {
        Category category = new Category();
        category.setName(categoryName);
        return category;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(Long categoryId) {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public void updateProduct(AddProductRequest product, Long productId) {

    }
}
