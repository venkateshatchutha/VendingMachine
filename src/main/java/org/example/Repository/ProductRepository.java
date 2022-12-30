package org.example.Repository;

import org.example.Models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> getAllProducts(){
        Product p1= new Product("Lay's","onepacket",10, 30.0);
        Product p2= new Product("gooday","onepacket",5, 10.0);
        Product p3= new Product("sprite","one",15, 20.0);
        Product p4= new Product("moongdal","one",10, 5.0);

        List<Product> products =new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        return products;
    }
}
