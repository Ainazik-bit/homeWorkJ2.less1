package com.company;

public abstract class Product {
    private String name;
    private double weight;
    private String test;

    public Product(String name, double weight, String test) {
        this.name = name;
        this.weight = weight;
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getTest() {
        return test;
    }
}
