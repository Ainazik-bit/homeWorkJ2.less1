package com.company;

public  class Food extends Product {
    private String concentrate;
    private String form;


    public Food(String name, double weight, String test,String concentrate, String form) {
        super(name, weight, test);
        this.concentrate = concentrate;
        this.form = form;
    }

    public String getConcentrate() {
        return concentrate;
    }

    public String getForm() {
        return form;
    }

    public void sells(int quantity, int price){
        System.out.println("Выручка "+quantity*price);
    }
    public void sells(int quantity, int price,int productReturn){
        System.out.println("Выручка "+(price*quantity-productReturn));
    }
    public final void sells(int quantity, int price, double tipes){
        System.out.println("Выручка "+quantity*price+tipes);
}}
