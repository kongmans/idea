package com.example.femaleclothingstore.model;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

