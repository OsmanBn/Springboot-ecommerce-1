package com.example.demo2.dto;

import com.example.demo2.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
