package com.codecool.animal;

public abstract class Animal {
    private String name;
    private int foodLevel;

    public Animal(String name, int foodLevel) {
        this.name = name;
        this.foodLevel = foodLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void eat(int foodQuantity){
        foodLevel += foodQuantity;
    }

    protected String generateIntroduction(){
        return "Hello ma nem is "+name;
    }

    public abstract void makeSound();
}
