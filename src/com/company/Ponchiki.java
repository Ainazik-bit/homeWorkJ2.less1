package com.company;

public final class Ponchiki extends Food{
    private Color color;
    private CookingMethod cookingMethod;

    public Ponchiki(String name, double weight, String test, String concentrate, String form, Color color,CookingMethod cookingMethod) {
        super(name, weight, test, concentrate, form);
        this.color = color;
        this.cookingMethod= cookingMethod;
    }

    public Color getColor() {
        return color;
    }

    public CookingMethod getCookingMethod() {
        return cookingMethod;
    }

    @Override
    public void sells(int quantity, int price) {
        super.sells(quantity, price);
        System.out.println(getColor()+" "+cookingMethod.getCookingMethod()+" "+cookingMethod.getTemperature());
    }

    @Override
    public void sells(int quantity, int price, int productReturn) {
        super.sells(quantity, price, productReturn);
        System.out.println(getColor()+" "+cookingMethod.getCookingMethod()+" " +cookingMethod.getTemperature());
    }
}
