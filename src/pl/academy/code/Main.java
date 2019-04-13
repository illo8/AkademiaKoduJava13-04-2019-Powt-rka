package pl.academy.code;

import pl.academy.code.countries.Country;
import pl.academy.code.pakiet.Car;
import pl.academy.code.pakiet.Car2;

public class Main {
    public static void main(String[] args) {
        Car carTurbo = new Car();
        carTurbo.setEngine(carTurbo.new Engine());
        //new Car.Engine();

        //carTurbo.getEngine().getPower()
        carTurbo.getEngine();
        Car2 car2Turbo = new Car2();
        Car2.Engine engineFromCar2 = new Car2.Engine();
        Country polandia = Country.POLAND;
        System.out.println(polandia.getCurrency());

    }
}
