package org.example.Models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product extends  BaseModel{
    String name;
    String Description;
    int Quantity;
    Double Price;
}
