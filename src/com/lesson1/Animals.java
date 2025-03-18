package com.lesson;

 class Animals {
     private String name;
     private int age;

     public Animals(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public int getAge(){
         return age;
     }

     public void info() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }

 }
