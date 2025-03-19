package com.lesson;

class MathFunctions {
    private int a;
    private int b;

    public MathFunctions(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public double div() {
        if (b == 0) {
            System.out.println("B nolga teng bo'la olmaydi");
        }
        return (double) a / b;
    }

    public int abs() {
        return Math.abs(a);
    }

    public int pow() {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions(7, 4);

        System.out.println("Qo‘shish: " + mathFunctions.add());
        System.out.println("Ayirish: " + mathFunctions.sub());
        System.out.println("Ko‘paytirish: " + mathFunctions.multiply());
        System.out.println("Bo‘lish: " + mathFunctions.div());
        System.out.println("Modul: " + mathFunctions.abs());
        System.out.println("Darajaga oshirish: " + mathFunctions.pow());
    }
}
