package org.example.Service;

import org.example.Models.Product;
import org.example.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    //@Autowired
    ProductRepository productRepository= new ProductRepository();

    public List<Product> getAllProductDetails(){
       return productRepository.getAllProducts();
    }

}
