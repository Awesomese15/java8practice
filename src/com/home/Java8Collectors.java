package com.home;

import java.nio.channels.NoConnectionPendingException;
import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class Java8Collectors {

    public static void main(String args []){
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> pricesInFloat=productsList.stream()
                .map(x->x.price).collect(Collectors.toList());
        System.out.println(pricesInFloat);

        Set<Float> pricesInInteger=productsList.stream().map(x->x.price).collect(Collectors.toSet());
        System.out.println(pricesInInteger);

        Integer sum=productsList.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println(sum);

        Double average=productsList.stream().collect(Collectors.averagingDouble(x->x.price));
        System.out.println(average);

        //Maximum
        Product maximum=productsList.stream().max(Comparator.comparing(Product::getPrice)).orElseThrow(NoConnectionPendingException::new);

        //Sorting
        Product [] products=productsList.toArray(new Product[0]);
        Comparator<Product> productComparator=Comparator.comparing(Product::getPrice);
        Arrays.sort(products,productComparator);
        System.out.println(products);

        //sorting decending order
        Comparator<Product> productComparator1=Comparator.
                                    comparing(Product::getPrice, (s1, s2)->{
                                        return s2.compareTo(s1);
                                        //Comparator.reverseOrder()
                                    });

        Arrays.sort(products,productComparator1);
        System.out.println(products);


        productsList.stream()
                .filter(product -> product.price>28000)
                .map(pm-> pm.price)
                .forEach(System.out::println);

       


    }
}
