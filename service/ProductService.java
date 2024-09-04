package com.boot.spring_boot_api.service;

import com.boot.spring_boot_api.entity.Product;
import com.boot.spring_boot_api.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    // Save product
    public Product saveProduct(Product product){
        try{
            return productRepository.save(product);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    // Fetch all products
    public List<Product> getAllProducts(){
        try{
            return productRepository.findAll();
        }catch(Exception e){
            throw new RuntimeException((e.getMessage()));
        }
    }

    // Fetch product by id
    public Optional<Product> getProductById(Long id){
        try{
            return productRepository.findById(id);
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    // Delete a product by id
    public boolean deleteProductById(Long id){
        try{
            productRepository.deleteById(id);
            return true;
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
