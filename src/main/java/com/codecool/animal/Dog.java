package com.codecool.animal;

public class Dog extends Animal{
    public Dog(String name, int foodLevel) {
        super(name, foodLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(this.generateIntroduction()+" vau vau");
    }

    public void play(){
        System.out.println("play ball");
    }

}
