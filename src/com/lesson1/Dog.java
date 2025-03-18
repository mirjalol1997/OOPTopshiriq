package com.lesson;

class Dog extends Animals {
    private String zoti;

    public Dog(String name, int age, String zoti) {
        super(name, age);
        this.zoti = zoti;
    }
    public String getZoti(){
        return zoti;
    }

    public void info(){
        super.info();
        System.out.println("Zoti: "+ zoti);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Olapar",4, "xaski");
        dog.info();
    }
}

