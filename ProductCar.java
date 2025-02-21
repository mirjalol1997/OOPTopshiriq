package com.lesson;

public class ProductCar {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.getModel("  Audi");
        audi.getColor("red");
        audi.getGearbox("Avtomat");
        audi.getPrice("30 000$");

        System.out.println("             ");

        Car kia = new Car();
        kia.getModel("  Kia");
        kia.getColor("black");
        kia.getGearbox("Mexanik");
        kia.getPrice("20 000$");
    }
}
