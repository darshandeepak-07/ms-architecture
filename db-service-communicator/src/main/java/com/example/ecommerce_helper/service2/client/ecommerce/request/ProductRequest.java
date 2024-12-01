package com.example.ecommerce_helper.service2.client.ecommerce.request;

import com.example.ecommerce_helper.service2.client.ecommerce.model.Image;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Long categoryId;
    private List<Image> imageList;
    private String categoryName;
}
