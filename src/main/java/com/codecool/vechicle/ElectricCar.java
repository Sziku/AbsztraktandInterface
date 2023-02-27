package com.codecool.vechicle;
//Legyen egy electric car osztály amit közvetlenül sosem példányosítunk.
//ElectricCar lehet Audi és Tesla.
//audi maximum range: 450 tesla maximum range 300
//minden electric car rendelkezik rendszámmal ami konstruktorban beállítható, getterel elkérhető.
//van minden autonak egy charge metodusa ami az autó availableRange field értékét növeli ha az még nem érte el a maximum range-et
//tesla esetében a charge metodus 10-el, audi esetén 15-el növeli availableRange field értékét a charge metodus.

//van egy ChargingStation osztály ami az ott parkoló autók listáját számon tartja. parkCar(ElectricCar newCar) metodus segítségével leparkolhat egy új autó a töltöállomásra.
//van egy charge(int index) metodusa ami az adott indexen lévő autót tölti.
//
public abstract class ElectricCar {
    private final String numberPlate;
    private final int maximumRange;
    private final int chargeAmount;
    private int availableRange;

    public ElectricCar(int maximumRange, int availableRange, int chargeAmount,  String numberPlate) {
        this.maximumRange = maximumRange;
        this.chargeAmount = chargeAmount;
        this.availableRange = availableRange;
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getAvailableRange() {
        return availableRange;
    }

    public void charge(){
        availableRange+=chargeAmount;
        if(availableRange > maximumRange) availableRange = maximumRange;
    }

    public void disCharge(int distance){
        availableRange-=distance;
        if(availableRange < 0) availableRange = 0;
    }
}
