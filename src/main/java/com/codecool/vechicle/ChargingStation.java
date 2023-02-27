package com.codecool.vechicle;

import java.util.ArrayList;
import java.util.List;

public class ChargingStation {
    private List<ElectricCar> parkedCars = new ArrayList<>();

    public List<ElectricCar> getParkedCars() {
        return parkedCars;
    }

    public void parkCar(ElectricCar newCar){
        parkedCars.add(newCar);
    }

    public void charge(int index){
        parkedCars.get(index).charge();
    }
}
