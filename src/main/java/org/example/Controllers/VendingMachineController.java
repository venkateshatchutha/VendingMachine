package org.example.Controllers;

import org.example.Models.Cash;
import org.example.Models.Product;
import org.example.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path="/JSON", produces="application/json")
//@CrossOrigin(origins="*")
public class VendingMachineController {
    @Autowired
    ProductService productService;

@GetMapping(value = "/get-product-details",produces = MediaType.APPLICATION_JSON_VALUE)
//    @RequestMapping(value = "/get-product-details", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Cash displayDashboard(){
        List<Product> products= productService.getAllProductDetails();
        System.out.println("got all products");
        return new Cash();
    }

}
