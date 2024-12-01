package com.darshan.ecommerce.request;

import com.darshan.ecommerce.model.Image;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Long categoryId;
    private List<Image> imageList;
    private String categoryName;
}
