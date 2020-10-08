package com.home;

import java.util.ArrayList;
import java.util.List;

class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilteringAndIterating {

    public static void main(String[] args) {
        List<Product1> Product1sList = new ArrayList<Product1>();
        //Adding Product1s  
        Product1sList.add(new Product1(1,"HP Laptop",25000f));
        Product1sList.add(new Product1(2,"Dell Laptop",30000f));
        Product1sList.add(new Product1(3,"Lenevo Laptop",28000f));
        Product1sList.add(new Product1(4,"Sony Laptop",28000f));
        Product1sList.add(new Product1(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data  
        Product1sList.stream()
                .filter(p -> p.price == 28000)
                .forEach(p -> System.out.println(p.name));
    }
}
