package com.lesson1;

import com.lesson1.Car;

public class ProductCar {
    public static void main(String[] args) {
        com.lesson1.Car audi = new com.lesson1.Car();
        audi.getModel("  Audi");
        audi.getColor("red");
        audi.getGearbox("Avtomat");
        audi.getPrice("30 000$");

        System.out.println("             ");

        com.lesson1.Car kia = new Car();
        kia.getModel("  Kia");
        kia.getColor("black");
        kia.getGearbox("Mexanik");
        kia.getPrice("20 000$");
    }
}
