package com.company;

public class Product {

    private String name;
    private int count;

    public Product (String name, int count){
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
