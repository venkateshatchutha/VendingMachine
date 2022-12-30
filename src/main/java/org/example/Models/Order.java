package org.example.Models;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class Order extends BaseModel {
    @OneToMany
    List<Product> products;
    @OneToOne
    Payment payment;
}
