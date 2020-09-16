package com.company;

public class Main {

    public static void main(String[] args) {
        Food food = new Food("Лагман",250,"Острый","Жаренный","Длинный");
        Ponchiki ponchiki = new Ponchiki("Пончик",100.8,"Сладкий","Мягкий","Круглый",Color.VANILLA ,new CookingMethod("Обжарка",50.8));
        Ponchiki ponchiki1 = new Ponchiki("Шоколадный",120.2,"Шоколадный","Мягко-твёрдый","Овальный",Color.CHOCOLATE,new CookingMethod("Обжарка",60.0));
        food.sells(12,250);
        ponchiki.sells(20,50,10);
        ponchiki1.sells(8,40,20.3);


      






    }
}
