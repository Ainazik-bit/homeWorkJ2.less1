package com.company;

public class CookingMethod {
    private String cookingMethod;
    private double temperature;

    public CookingMethod(String cookingMethod, double temperature) {
        this.cookingMethod = cookingMethod;
        this.temperature = temperature;
    }

    public String getCookingMethod() {
        return cookingMethod;
    }

    public double getTemperature() {
        return temperature;
    }
}
