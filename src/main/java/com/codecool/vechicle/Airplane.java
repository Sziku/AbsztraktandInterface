package com.codecool.vechicle;

import com.codecool.FlyAble;
import com.codecool.LandAble;



public class Airplane implements FlyAble, LandAble {
    @Override
    public void fly() {
        System.out.println("I believe I can fly");
    }

    @Override
    public void land() {
        System.out.println("Runway");
    }

    public void callTower(){
        System.out.println("Huston there is a problem.");
    }

}
