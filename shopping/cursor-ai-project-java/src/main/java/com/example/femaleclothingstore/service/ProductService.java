package com.example.femaleclothingstore.service;

import com.example.femaleclothingstore.model.Product;
import com.example.femaleclothingstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    public int insert(Product product) {
        return productRepository.insert(product);
    }

    public int update(Product product) {
        return productRepository.update(product);
    }

    public int deleteById(Long id) {
        return productRepository.deleteById(id);
    }
}
