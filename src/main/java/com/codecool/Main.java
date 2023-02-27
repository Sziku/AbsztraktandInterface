package com.codecool;

import com.codecool.animal.Animal;
import com.codecool.animal.Cat;
import com.codecool.animal.Dog;
import com.codecool.vechicle.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Doge",10);
        Animal cat = new Cat("Devil",15);

        dog.eat(30);
        cat.eat(40);

        System.out.println(dog.getFoodLevel());
        System.out.println(cat.getFoodLevel());

        dog.makeSound();
        cat.makeSound();

        Dog valodiDog = (Dog) dog; //castolás
        valodiDog.play();

        FlyAble flyAble = new Airplane();
        flyAble.fly();
        Airplane airplane = new Airplane();
        airplane.callTower();

        System.out.println("---------------------------------");
        ElectricCar audi = new Audi("ABC-123");
        ElectricCar tesla = new Tesla("ABE-234");

        System.out.println(audi.getAvailableRange());
        System.out.println(tesla.getAvailableRange());
        tesla.disCharge(300);
        System.out.println(tesla.getAvailableRange());
        tesla.charge();
        System.out.println(tesla.getAvailableRange());

        ElectricCar audi1 = new Audi("ABC-124");
        ElectricCar tesla1 = new Tesla("ABE-235");
        ElectricCar audi2 = new Audi("ABC-126");
        ElectricCar tesla2 = new Tesla("ABE-237");
        ElectricCar audi3 = new Audi("ABC-128");
        ElectricCar tesla3 = new Tesla("ABE-239");
        ElectricCar audi4 = new Audi("ABC-130");
        ElectricCar tesla4 = new Tesla("ABE-240");

        ChargingStation station = new ChargingStation();

        station.parkCar(audi);
        station.parkCar(audi1);
        station.parkCar(audi2);
        station.parkCar(audi3);
        station.parkCar(audi4);

        for (ElectricCar parkedcar : station.getParkedCars()){
            System.out.println(parkedcar.getNumberPlate());
        }

        station.charge(4);
    }
}
